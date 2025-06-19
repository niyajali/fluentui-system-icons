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

public val FluentIcons.Regular.LayerDiagonal: ImageVector
    get() {
        if (_LayerDiagonal != null) {
            return _LayerDiagonal!!
        }
        _LayerDiagonal = ImageVector.Builder(
            name = "Regular.LayerDiagonal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.5f, 4.252f)
                curveTo(12.5f, 3.732f, 11.984f, 3.37f, 11.495f, 3.547f)
                lineTo(4.655f, 6.022f)
                curveTo(3.962f, 6.273f, 3.5f, 6.931f, 3.5f, 7.667f)
                verticalLineTo(13.749f)
                curveTo(3.5f, 14.269f, 4.016f, 14.631f, 4.505f, 14.454f)
                lineTo(5f, 14.275f)
                verticalLineTo(15.87f)
                curveTo(3.538f, 16.388f, 2f, 15.304f, 2f, 13.749f)
                verticalLineTo(7.667f)
                curveTo(2f, 6.299f, 2.857f, 5.077f, 4.144f, 4.611f)
                lineTo(10.984f, 2.136f)
                curveTo(12.451f, 1.605f, 14f, 2.692f, 14f, 4.252f)
                verticalLineTo(4.429f)
                lineTo(12.5f, 4.972f)
                verticalLineTo(4.252f)
                close()
                moveTo(16.5f, 7.252f)
                curveTo(16.5f, 6.732f, 15.984f, 6.37f, 15.495f, 6.547f)
                lineTo(8.325f, 9.141f)
                curveTo(7.83f, 9.32f, 7.5f, 9.79f, 7.5f, 10.317f)
                verticalLineTo(16.749f)
                curveTo(7.5f, 17.269f, 8.016f, 17.631f, 8.505f, 17.454f)
                lineTo(9f, 17.275f)
                verticalLineTo(18.871f)
                curveTo(7.538f, 19.388f, 6f, 18.303f, 6f, 16.749f)
                verticalLineTo(10.317f)
                curveTo(6f, 9.159f, 6.725f, 8.125f, 7.814f, 7.731f)
                lineTo(14.984f, 5.136f)
                curveTo(16.451f, 4.605f, 18f, 5.692f, 18f, 7.252f)
                verticalLineTo(7.429f)
                lineTo(16.5f, 7.972f)
                verticalLineTo(7.252f)
                close()
                moveTo(19.495f, 9.547f)
                curveTo(19.984f, 9.37f, 20.5f, 9.732f, 20.5f, 10.252f)
                verticalLineTo(17.035f)
                curveTo(20.5f, 17.351f, 20.302f, 17.633f, 20.005f, 17.74f)
                lineTo(12.505f, 20.454f)
                curveTo(12.016f, 20.631f, 11.5f, 20.269f, 11.5f, 19.749f)
                verticalLineTo(12.966f)
                curveTo(11.5f, 12.65f, 11.698f, 12.368f, 11.995f, 12.261f)
                lineTo(19.495f, 9.547f)
                close()
                moveTo(22f, 10.252f)
                curveTo(22f, 8.692f, 20.451f, 7.605f, 18.984f, 8.136f)
                lineTo(11.484f, 10.85f)
                curveTo(10.594f, 11.172f, 10f, 12.018f, 10f, 12.966f)
                verticalLineTo(19.749f)
                curveTo(10f, 21.309f, 11.549f, 22.396f, 13.016f, 21.865f)
                lineTo(20.516f, 19.151f)
                curveTo(21.406f, 18.829f, 22f, 17.983f, 22f, 17.035f)
                verticalLineTo(10.252f)
                close()
            }
        }.build()

        return _LayerDiagonal!!
    }

@Suppress("ObjectPropertyName")
private var _LayerDiagonal: ImageVector? = null

@Preview
@Composable
private fun LayerDiagonalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.LayerDiagonal, contentDescription = null)
    }
}
