package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.RibbonStar: ImageVector
    get() {
        if (_RibbonStar != null) {
            return _RibbonStar!!
        }
        _RibbonStar = ImageVector.Builder(
            name = "Filled.RibbonStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.001f, 21.245f)
                lineTo(17.002f, 15.244f)
                curveTo(15.632f, 16.343f, 13.893f, 17f, 12f, 17f)
                curveTo(10.108f, 17f, 8.37f, 16.344f, 7.001f, 15.246f)
                lineTo(7.003f, 21.245f)
                curveTo(7.003f, 21.853f, 7.687f, 22.208f, 8.184f, 21.858f)
                lineTo(12.001f, 19.171f)
                lineTo(15.819f, 21.858f)
                curveTo(16.316f, 22.208f, 17.001f, 21.853f, 17.001f, 21.245f)
                close()
                moveTo(19f, 9f)
                curveTo(19f, 5.134f, 15.866f, 2f, 12f, 2f)
                curveTo(8.134f, 2f, 5f, 5.134f, 5f, 9f)
                curveTo(5f, 12.866f, 8.134f, 16f, 12f, 16f)
                curveTo(15.866f, 16f, 19f, 12.866f, 19f, 9f)
                close()
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
        Image(imageVector = FluentIcons.Filled.RibbonStar, contentDescription = null)
    }
}
