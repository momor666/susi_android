package org.fossasia.susi.ai.data.model

import io.realm.RealmObject

open class WebSearchModel(
        var url: String? = null,
        var headline: String? = null,
        var body: String? = null,
        var imageURL: String? = null
) : RealmObject()
