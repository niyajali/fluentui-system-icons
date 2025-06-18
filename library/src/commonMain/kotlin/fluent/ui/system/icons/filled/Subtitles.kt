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

public val FluentUi.Filled.Subtitles: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Subtitles",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 18.545f, 20.545f, 20f, 18.75f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(5f, 13.25f)
            curveTo(5f, 13.664f, 5.336f, 14f, 5.75f, 14f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 14f, 14f, 13.664f, 14f, 13.25f)
            curveTo(14f, 12.836f, 13.664f, 12.5f, 13.25f, 12.5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 12.5f, 5f, 12.836f, 5f, 13.25f)
            close()
            moveTo(15.75f, 12.5f)
            curveTo(15.336f, 12.5f, 15f, 12.836f, 15f, 13.25f)
            curveTo(15f, 13.664f, 15.336f, 14f, 15.75f, 14f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 14f, 19f, 13.664f, 19f, 13.25f)
            curveTo(19f, 12.836f, 18.664f, 12.5f, 18.25f, 12.5f)
            horizontalLineTo(15.75f)
            close()
            moveTo(5f, 16.25f)
            curveTo(5f, 16.664f, 5.336f, 17f, 5.75f, 17f)
            horizontalLineTo(9.25f)
            curveTo(9.664f, 17f, 10f, 16.664f, 10f, 16.25f)
            curveTo(10f, 15.836f, 9.664f, 15.5f, 9.25f, 15.5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 15.5f, 5f, 15.836f, 5f, 16.25f)
            close()
            moveTo(11.75f, 15.5f)
            curveTo(11.336f, 15.5f, 11f, 15.836f, 11f, 16.25f)
            curveTo(11f, 16.664f, 11.336f, 17f, 11.75f, 17f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 17f, 19f, 16.664f, 19f, 16.25f)
            curveTo(19f, 15.836f, 18.664f, 15.5f, 18.25f, 15.5f)
            horizontalLineTo(11.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SubtitlesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Subtitles, contentDescription = null)
    }
}
