package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PictureInPictureExit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PictureInPictureExit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 11f)
            curveTo(11.105f, 11f, 12f, 10.105f, 12f, 9f)
            verticalLineTo(4f)
            curveTo(12f, 2.895f, 11.105f, 2f, 10f, 2f)
            horizontalLineTo(3f)
            curveTo(1.895f, 2f, 1f, 2.895f, 1f, 4f)
            verticalLineTo(9f)
            curveTo(1f, 9.759f, 1.423f, 10.42f, 2.047f, 10.759f)
            curveTo(2.33f, 10.913f, 2.655f, 11f, 3f, 11f)
            horizontalLineTo(10f)
            close()
            moveTo(18.75f, 6.5f)
            horizontalLineTo(13f)
            verticalLineTo(5f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 5f, 22f, 6.455f, 22f, 8.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 19.545f, 20.545f, 21f, 18.75f, 21f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(11.829f)
            curveTo(2.313f, 11.94f, 2.649f, 12f, 3f, 12f)
            horizontalLineTo(3.5f)
            verticalLineTo(17.75f)
            curveTo(3.5f, 18.716f, 4.284f, 19.5f, 5.25f, 19.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 19.5f, 20.5f, 18.716f, 20.5f, 17.75f)
            verticalLineTo(8.25f)
            curveTo(20.5f, 7.284f, 19.716f, 6.5f, 18.75f, 6.5f)
            close()
            moveTo(15.939f, 16f)
            horizontalLineTo(14.25f)
            curveTo(13.836f, 16f, 13.5f, 16.336f, 13.5f, 16.75f)
            curveTo(13.5f, 17.164f, 13.836f, 17.5f, 14.25f, 17.5f)
            horizontalLineTo(17.75f)
            curveTo(18.164f, 17.5f, 18.5f, 17.164f, 18.5f, 16.75f)
            verticalLineTo(13.25f)
            curveTo(18.5f, 12.836f, 18.164f, 12.5f, 17.75f, 12.5f)
            curveTo(17.336f, 12.5f, 17f, 12.836f, 17f, 13.25f)
            verticalLineTo(14.939f)
            lineTo(14.28f, 12.22f)
            curveTo(13.987f, 11.927f, 13.513f, 11.927f, 13.22f, 12.22f)
            curveTo(12.927f, 12.513f, 12.927f, 12.987f, 13.22f, 13.28f)
            lineTo(15.939f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PictureInPictureExitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PictureInPictureExit, contentDescription = null)
    }
}
