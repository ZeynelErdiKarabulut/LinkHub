package com.erdi.linkhub.util

import com.erdi.linkhub.data.LinkInfo
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class LinkInfoGeneratorTest {

    @Test
    fun generalLink_return_generalInfo() {
        val url = "https://amr.com"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("amr Link", "Link from amr website")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun githubProfile_return_correctInfo() {
        val url = "https://github.com/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi profile", "erdi Github profile")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun githubRepository_return_correctInfo() {
        val url = "https://github.com/erdi/linkhub"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("linkhub Repository", "linkhub Github Repository")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun githubLink_return_correctInfo() {
        val url = "https://github.com/erdi/linkhub/readme.md"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Github Link", "Link from Github.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun stackoverflowQuestion_return_correctInfo() {
        val url = "https://stackoverflow.com/questions/android"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Programming question", "Question from stackoverflow.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun stackoverflowGeneral_return_correctInfo() {
        val url = "https://stackoverflow.com/user/android"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("stackoverflow Link", "Link from stackoverflow.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun twitterProfile_return_correctInfo() {
        val url = "https://twitter.com/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi profile", "erdi twitter profile")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun twitterTweet_return_correctInfo() {
        val url = "https://twitter.com/erdi/tweet"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Tweet", "Tweet from Twitter.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun facebookProfile_return_correctInfo() {
        val url = "https://www.facebook.com/android"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("android profile", "android Facebook profile")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun facebookGroup_return_correctInfo() {
        val url = "https://www.facebook.com/groups/android"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Facebook Group", "Group from Facebook.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun facebookPost_return_correctInfo() {
        val url = "https://www.facebook.com/android/postId"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Facebook post", "Post from Facebook.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun instagramProfile_return_correctInfo() {
        val url = "https://www.instagram.com/android"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("android profile", "android Instagram profile")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun instagramPost_return_correctInfo() {
        val url = "https://www.instagram.com/android/postId"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Instagram post", "Post from Instagram.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun redditProfile_return_correctInfo() {
        val url = "https://www.reddit.com/user/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi profile", "erdi Reddit profile")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun redditSubreddit_return_correctInfo() {
        val url = "https://www.reddit.com/r/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi Subreddit", "erdi Subreddit page")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun redditPost_return_correctInfo() {
        val url = "https://www.reddit.com/r/android/12345"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Reddit Post", "Post from Reddit.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun linkedinProfile_return_correctInfo() {
        val url = "https://www.linkedin.com/in/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi Profile", "erdi Linkedin Profile")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun linkedinJob_return_correctInfo() {
        val url = "https://www.linkedin.com/jobs/android"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("linkedin Job", "Job from linkedin.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun linkedinCompany_return_correctInfo() {
        val url = "https://www.linkedin.com/company/google"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("google Company", "google Company page on Linkedin.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun linkedinPost_return_correctInfo() {
        val url = "https://www.linkedin.com/feed/update/01234"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("linkedin Post", "Post from linkedin.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun youtubeChannel_return_correctInfo() {
        val url = "https://youtube.com/c/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi Channel", "erdi Youtube Channel")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun youtubeShortcutLinkChannel_return_correctInfo() {
        val url = "https://youtu.be/c/erdi"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("erdi Channel", "erdi Youtube Channel")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun youtubeVideo_return_correctInfo() {
        val url = "https://www.youtube.com/watch?v=12345"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Youtube video", "video from Youtube.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }

    @Test
    fun youtubeShortcutLinkVideo_return_correctInfo() {
        val url = "https://www.youtu.be/watch?v=12345"
        val linkInfo = generateLinkInfo(url)
        val expectedInfo = LinkInfo("Youtube video", "video from Youtube.com")
        assertThat(linkInfo).isEqualTo(expectedInfo)
    }
}