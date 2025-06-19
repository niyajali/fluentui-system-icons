package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.People: ImageVector
    get() {
        if (_People != null) {
            return _People!!
        }
        _People = ImageVector.Builder(
            name = "Colored.People",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(14.378f, 14.727f),
                    end = Offset(16.3f, 20.301f)
                )
            ) {
                moveTo(17f, 19.5f)
                curveTo(16.268f, 19.5f, 15.643f, 19.429f, 15.11f, 19.309f)
                curveTo(12f, 18.604f, 12f, 16.2f, 12f, 16.2f)
                curveTo(12f, 14.985f, 12.985f, 14f, 14.2f, 14f)
                curveTo(16.072f, 14f, 17.943f, 13.988f, 19.814f, 14f)
                curveTo(21.023f, 14.008f, 22f, 14.99f, 22f, 16.2f)
                curveTo(22f, 16.2f, 22f, 19.075f, 17.935f, 19.458f)
                curveTo(17.645f, 19.485f, 17.333f, 19.5f, 17f, 19.5f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.392f to Color(0xFF3B148A),
                        1f to Color(0x003B148A)
                    ),
                    center = Offset(10.731f, 16.747f),
                    radius = 6.63f
                ),
                fillAlpha = 0.5f,
            ) {
                moveTo(17f, 19.5f)
                curveTo(16.268f, 19.5f, 15.643f, 19.429f, 15.11f, 19.309f)
                curveTo(12f, 18.604f, 12f, 16.2f, 12f, 16.2f)
                curveTo(12f, 14.985f, 12.985f, 14f, 14.2f, 14f)
                curveTo(16.072f, 14f, 17.943f, 13.988f, 19.814f, 14f)
                curveTo(21.023f, 14.008f, 22f, 14.99f, 22f, 16.2f)
                curveTo(22f, 16.2f, 22f, 19.075f, 17.935f, 19.458f)
                curveTo(17.645f, 19.485f, 17.333f, 19.5f, 17f, 19.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFBD96FF),
                        1f to Color(0xFF9C6CFE)
                    ),
                    start = Offset(4.854f, 14.931f),
                    end = Offset(7.41f, 21.927f)
                )
            ) {
                moveTo(4.25f, 14f)
                curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
                curveTo(14f, 21f, 14f, 16.5f, 14f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
                horizontalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0x00885EDB),
                        1f to Color(0xFFE362F8)
                    ),
                    start = Offset(8f, 13.167f),
                    end = Offset(11.607f, 24.721f)
                )
            ) {
                moveTo(4.25f, 14f)
                curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(2f, 16.5f, 2f, 21f, 8f, 21f)
                curveTo(14f, 21f, 14f, 16.5f, 14f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
                horizontalLineTo(4.25f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF7A41DC)
                    ),
                    start = Offset(15.427f, 6.798f),
                    end = Offset(18.485f, 11.68f)
                )
            ) {
                moveTo(17f, 12f)
                curveTo(18.657f, 12f, 20f, 10.657f, 20f, 9f)
                curveTo(20f, 7.343f, 18.657f, 6f, 17f, 6f)
                curveTo(15.343f, 6f, 14f, 7.343f, 14f, 9f)
                curveTo(14f, 10.657f, 15.343f, 12f, 17f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFFBD96FF),
                        1f to Color(0xFF9C6CFE)
                    ),
                    start = Offset(5.902f, 5.063f),
                    end = Offset(9.98f, 11.574f)
                )
            ) {
                moveTo(8f, 12f)
                curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
                curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
                curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
                curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
                close()
            }
        }.build()

        return _People!!
    }

@Suppress("ObjectPropertyName")
private var _People: ImageVector? = null

@Preview
@Composable
private fun PeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.People, contentDescription = null)
    }
}
