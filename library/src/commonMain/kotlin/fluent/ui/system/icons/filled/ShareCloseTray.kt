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

public val FluentUi.Filled.ShareCloseTray: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareCloseTray",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.25f, 20f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
            horizontalLineTo(19.75f)
            curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(22f, 18.993f, 20.993f, 20f, 19.75f, 20f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12.53f, 16.535f)
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
            curveTo(12.199f, 16.755f, 12.39f, 16.676f, 12.53f, 16.535f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareCloseTrayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShareCloseTray, contentDescription = null)
    }
}
