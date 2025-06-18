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

public val FluentUi.Regular.ShareCloseTray: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareCloseTray",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 17.75f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 20f, 22f, 18.993f, 22f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineTo(17.75f)
            close()
            moveTo(4.25f, 18.5f)
            curveTo(3.836f, 18.5f, 3.5f, 18.164f, 3.5f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3.5f, 5.836f, 3.836f, 5.5f, 4.25f, 5.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 5.5f, 20.5f, 5.836f, 20.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(20.5f, 18.164f, 20.164f, 18.5f, 19.75f, 18.5f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12f, 16.754f)
            curveTo(12.199f, 16.755f, 12.39f, 16.676f, 12.53f, 16.535f)
            lineTo(15.785f, 13.28f)
            curveTo(16.078f, 12.987f, 16.078f, 12.513f, 15.785f, 12.22f)
            curveTo(15.492f, 11.927f, 15.017f, 11.927f, 14.724f, 12.22f)
            lineTo(12.75f, 14.194f)
            verticalLineTo(7.747f)
            curveTo(12.75f, 7.333f, 12.414f, 6.997f, 12f, 6.997f)
            curveTo(11.586f, 6.997f, 11.25f, 7.333f, 11.25f, 7.747f)
            verticalLineTo(14.192f)
            lineTo(9.281f, 12.22f)
            curveTo(8.988f, 11.927f, 8.513f, 11.927f, 8.22f, 12.219f)
            curveTo(7.927f, 12.512f, 7.927f, 12.987f, 8.219f, 13.28f)
            lineTo(11.469f, 16.535f)
            curveTo(11.61f, 16.675f, 11.801f, 16.754f, 12f, 16.754f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareCloseTrayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShareCloseTray, contentDescription = null)
    }
}
