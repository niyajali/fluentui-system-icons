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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.RibbonStar: ImageVector
    get() {
        if (_RibbonStar != null) {
            return _RibbonStar!!
        }
        _RibbonStar = ImageVector.Builder(
            name = "Regular.RibbonStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.229f, 5.642f)
                lineTo(13.141f, 7.495f)
                lineTo(15.185f, 7.79f)
                curveTo(15.395f, 7.821f, 15.478f, 8.078f, 15.327f, 8.225f)
                lineTo(13.849f, 9.666f)
                lineTo(14.198f, 11.701f)
                curveTo(14.233f, 11.91f, 14.014f, 12.069f, 13.827f, 11.97f)
                lineTo(12f, 11.008f)
                lineTo(10.173f, 11.97f)
                curveTo(9.986f, 12.069f, 9.767f, 11.91f, 9.803f, 11.701f)
                lineTo(10.153f, 9.666f)
                lineTo(8.673f, 8.226f)
                curveTo(8.522f, 8.078f, 8.605f, 7.821f, 8.815f, 7.79f)
                lineTo(10.859f, 7.495f)
                lineTo(11.771f, 5.642f)
                curveTo(11.865f, 5.453f, 12.135f, 5.453f, 12.229f, 5.642f)
                close()
                moveTo(19f, 9f)
                curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
                curveTo(8.134f, 2f, 5f, 5.134f, 5f, 9f)
                curveTo(5f, 10.907f, 5.763f, 12.636f, 6.999f, 13.898f)
                lineTo(7.001f, 21.25f)
                lineTo(7.008f, 21.355f)
                curveTo(7.081f, 21.897f, 7.715f, 22.193f, 8.183f, 21.863f)
                lineTo(11.999f, 19.176f)
                lineTo(15.818f, 21.864f)
                lineTo(15.907f, 21.918f)
                curveTo(16.393f, 22.171f, 16.999f, 21.822f, 16.999f, 21.25f)
                lineTo(17.001f, 13.898f)
                curveTo(18.237f, 12.636f, 19f, 10.907f, 19f, 9f)
                close()
                moveTo(15.499f, 15.064f)
                lineTo(15.499f, 19.805f)
                lineTo(12.431f, 17.645f)
                lineTo(12.33f, 17.585f)
                curveTo(12.087f, 17.466f, 11.794f, 17.486f, 11.567f, 17.645f)
                lineTo(8.501f, 19.805f)
                lineTo(8.501f, 15.064f)
                curveTo(9.53f, 15.659f, 10.725f, 16f, 12f, 16f)
                curveTo(13.275f, 16f, 14.47f, 15.659f, 15.499f, 15.064f)
                close()
                moveTo(6.5f, 9f)
                curveTo(6.5f, 5.962f, 8.962f, 3.5f, 12f, 3.5f)
                curveTo(15.038f, 3.5f, 17.5f, 5.962f, 17.5f, 9f)
                curveTo(17.5f, 12.038f, 15.038f, 14.5f, 12f, 14.5f)
                curveTo(8.962f, 14.5f, 6.5f, 12.038f, 6.5f, 9f)
                close()
            }
        }.build()

        return _RibbonStar!!
    }

@Suppress("ObjectPropertyName")
private var _RibbonStar: ImageVector? = null

@Preview
@Composable
private fun RibbonStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RibbonStar, contentDescription = null)
    }
}
