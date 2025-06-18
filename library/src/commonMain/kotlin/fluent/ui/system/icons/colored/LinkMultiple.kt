package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.LinkMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.LinkMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.429f to Color(0xFF367AF2),
                    0.942f to Color(0xFF5750E2),
                    1f to Color(0xFF6F47DF)
                ),
                center = Offset(1.773f, 5f),
                radius = 17.591f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 10f)
            curveTo(1f, 7.239f, 3.239f, 5f, 6f, 5f)
            horizontalLineTo(13f)
            curveTo(15.761f, 5f, 18f, 7.239f, 18f, 10f)
            curveTo(18f, 12.761f, 15.761f, 15f, 13f, 15f)
            horizontalLineTo(6f)
            curveTo(3.239f, 15f, 1f, 12.761f, 1f, 10f)
            close()
            moveTo(6f, 7f)
            curveTo(4.343f, 7f, 3f, 8.343f, 3f, 10f)
            curveTo(3f, 11.657f, 4.343f, 13f, 6f, 13f)
            horizontalLineTo(13f)
            curveTo(14.657f, 13f, 16f, 11.657f, 16f, 10f)
            curveTo(16f, 8.343f, 14.657f, 7f, 13f, 7f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.239f to Color(0x00261D82),
                    0.424f to Color(0xFF261D82),
                    0.568f to Color(0xFF261D82),
                    0.754f to Color(0x00261D82)
                ),
                center = Offset(10.5f, 14.5f),
                radius = 7f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 10f)
            curveTo(1f, 7.239f, 3.239f, 5f, 6f, 5f)
            horizontalLineTo(13f)
            curveTo(15.761f, 5f, 18f, 7.239f, 18f, 10f)
            curveTo(18f, 12.761f, 15.761f, 15f, 13f, 15f)
            horizontalLineTo(6f)
            curveTo(3.239f, 15f, 1f, 12.761f, 1f, 10f)
            close()
            moveTo(6f, 7f)
            curveTo(4.343f, 7f, 3f, 8.343f, 3f, 10f)
            curveTo(3f, 11.657f, 4.343f, 13f, 6f, 13f)
            horizontalLineTo(13f)
            curveTo(14.657f, 13f, 16f, 11.657f, 16f, 10f)
            curveTo(16f, 8.343f, 14.657f, 7f, 13f, 7f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x005157E4),
                    0.066f to Color(0xFF5157E4),
                    0.319f to Color(0xFF5157E4),
                    0.6f to Color(0x005157E4)
                ),
                start = Offset(17f, 15.5f),
                end = Offset(8.382f, 5.667f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 10f)
            curveTo(1f, 7.239f, 3.239f, 5f, 6f, 5f)
            horizontalLineTo(13f)
            curveTo(15.761f, 5f, 18f, 7.239f, 18f, 10f)
            curveTo(18f, 12.761f, 15.761f, 15f, 13f, 15f)
            horizontalLineTo(6f)
            curveTo(3.239f, 15f, 1f, 12.761f, 1f, 10f)
            close()
            moveTo(6f, 7f)
            curveTo(4.343f, 7f, 3f, 8.343f, 3f, 10f)
            curveTo(3f, 11.657f, 4.343f, 13f, 6f, 13f)
            horizontalLineTo(13f)
            curveTo(14.657f, 13f, 16f, 11.657f, 16f, 10f)
            curveTo(16f, 8.343f, 14.657f, 7f, 13f, 7f)
            horizontalLineTo(6f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(0.536f, 4.188f),
                end = Offset(11.117f, 28.777f)
            )
        ) {
            moveTo(15.829f, 9f)
            horizontalLineTo(11f)
            curveTo(8.239f, 9f, 6f, 11.239f, 6f, 14f)
            curveTo(6f, 16.761f, 8.239f, 19f, 11f, 19f)
            horizontalLineTo(18f)
            curveTo(20.761f, 19f, 23f, 16.761f, 23f, 14f)
            curveTo(23f, 11.239f, 20.761f, 9f, 18f, 9f)
            horizontalLineTo(17.9f)
            curveTo(17.966f, 9.323f, 18f, 9.658f, 18f, 10f)
            curveTo(18f, 10.342f, 17.966f, 10.677f, 17.9f, 11f)
            horizontalLineTo(18f)
            curveTo(19.657f, 11f, 21f, 12.343f, 21f, 14f)
            curveTo(21f, 15.657f, 19.657f, 17f, 18f, 17f)
            horizontalLineTo(11f)
            curveTo(9.343f, 17f, 8f, 15.657f, 8f, 14f)
            curveTo(8f, 12.343f, 9.343f, 11f, 11f, 11f)
            horizontalLineTo(15.829f)
            curveTo(15.94f, 10.687f, 16f, 10.351f, 16f, 10f)
            curveTo(16f, 9.649f, 15.94f, 9.313f, 15.829f, 9f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.246f to Color(0x002764E7),
                    0.396f to Color(0xFF2764E7),
                    0.578f to Color(0xFF2764E7),
                    0.748f to Color(0x002764E7)
                ),
                center = Offset(13.5f, 9.5f),
                radius = 7f
            )
        ) {
            moveTo(15.829f, 9f)
            horizontalLineTo(11f)
            curveTo(8.239f, 9f, 6f, 11.239f, 6f, 14f)
            curveTo(6f, 16.761f, 8.239f, 19f, 11f, 19f)
            horizontalLineTo(18f)
            curveTo(20.761f, 19f, 23f, 16.761f, 23f, 14f)
            curveTo(23f, 11.239f, 20.761f, 9f, 18f, 9f)
            horizontalLineTo(17.9f)
            curveTo(17.966f, 9.323f, 18f, 9.658f, 18f, 10f)
            curveTo(18f, 10.342f, 17.966f, 10.677f, 17.9f, 11f)
            horizontalLineTo(18f)
            curveTo(19.657f, 11f, 21f, 12.343f, 21f, 14f)
            curveTo(21f, 15.657f, 19.657f, 17f, 18f, 17f)
            horizontalLineTo(11f)
            curveTo(9.343f, 17f, 8f, 15.657f, 8f, 14f)
            curveTo(8f, 12.343f, 9.343f, 11f, 11f, 11f)
            horizontalLineTo(15.829f)
            curveTo(15.94f, 10.687f, 16f, 10.351f, 16f, 10f)
            curveTo(16f, 9.649f, 15.94f, 9.313f, 15.829f, 9f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x3D31B3EE),
                    0.208f to Color(0xFF31B3EE),
                    0.569f to Color(0xFF31B3EE),
                    0.763f to Color(0x0031B3EE)
                ),
                start = Offset(8.5f, 5f),
                end = Offset(16.77f, 12.103f)
            )
        ) {
            moveTo(15.829f, 9f)
            horizontalLineTo(11f)
            curveTo(8.239f, 9f, 6f, 11.239f, 6f, 14f)
            curveTo(6f, 16.761f, 8.239f, 19f, 11f, 19f)
            horizontalLineTo(18f)
            curveTo(20.761f, 19f, 23f, 16.761f, 23f, 14f)
            curveTo(23f, 11.239f, 20.761f, 9f, 18f, 9f)
            horizontalLineTo(17.9f)
            curveTo(17.966f, 9.323f, 18f, 9.658f, 18f, 10f)
            curveTo(18f, 10.342f, 17.966f, 10.677f, 17.9f, 11f)
            horizontalLineTo(18f)
            curveTo(19.657f, 11f, 21f, 12.343f, 21f, 14f)
            curveTo(21f, 15.657f, 19.657f, 17f, 18f, 17f)
            horizontalLineTo(11f)
            curveTo(9.343f, 17f, 8f, 15.657f, 8f, 14f)
            curveTo(8f, 12.343f, 9.343f, 11f, 11f, 11f)
            horizontalLineTo(15.829f)
            curveTo(15.94f, 10.687f, 16f, 10.351f, 16f, 10f)
            curveTo(16f, 9.649f, 15.94f, 9.313f, 15.829f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LinkMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.LinkMultiple, contentDescription = null)
    }
}
