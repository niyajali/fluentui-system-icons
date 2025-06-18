package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.Couch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Couch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.75f, 4f)
            horizontalLineTo(7.25f)
            curveTo(5.731f, 4f, 4.5f, 5.231f, 4.5f, 6.75f)
            verticalLineTo(8f)
            curveTo(6.263f, 8f, 7.722f, 9.304f, 7.965f, 11f)
            horizontalLineTo(16.035f)
            curveTo(16.278f, 9.304f, 17.737f, 8f, 19.5f, 8f)
            verticalLineTo(6.75f)
            curveTo(19.5f, 5.231f, 18.269f, 4f, 16.75f, 4f)
            close()
            moveTo(17f, 11.5f)
            curveTo(17f, 10.119f, 18.119f, 9f, 19.5f, 9f)
            curveTo(20.881f, 9f, 22f, 10.119f, 22f, 11.5f)
            verticalLineTo(14.25f)
            curveTo(22f, 15.684f, 20.902f, 16.862f, 19.5f, 16.989f)
            verticalLineTo(18.25f)
            curveTo(19.5f, 18.664f, 19.164f, 19f, 18.75f, 19f)
            curveTo(18.336f, 19f, 18f, 18.664f, 18f, 18.25f)
            verticalLineTo(17f)
            horizontalLineTo(6f)
            verticalLineTo(18.25f)
            curveTo(6f, 18.664f, 5.664f, 19f, 5.25f, 19f)
            curveTo(4.836f, 19f, 4.5f, 18.664f, 4.5f, 18.25f)
            verticalLineTo(16.989f)
            curveTo(3.098f, 16.862f, 2f, 15.684f, 2f, 14.25f)
            verticalLineTo(11.5f)
            curveTo(2f, 10.119f, 3.119f, 9f, 4.5f, 9f)
            curveTo(5.881f, 9f, 7f, 10.119f, 7f, 11.5f)
            curveTo(7f, 11.776f, 7.224f, 12f, 7.5f, 12f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 12f, 17f, 11.776f, 17f, 11.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CouchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Couch, contentDescription = null)
    }
}
