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

public val FluentIcons.Colored.Heart: ImageVector
    get() {
        if (_Heart != null) {
            return _Heart!!
        }
        _Heart = ImageVector.Builder(
            name = "Colored.Heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF97DBD),
                        1f to Color(0xFFD7257D)
                    ),
                    start = Offset(-2.376f, -0.938f),
                    end = Offset(8.135f, 21.378f)
                )
            ) {
                moveTo(12.82f, 5.58f)
                lineTo(11.999f, 6.402f)
                lineTo(11.176f, 5.579f)
                curveTo(9.077f, 3.48f, 5.673f, 3.48f, 3.574f, 5.579f)
                curveTo(1.475f, 7.678f, 1.475f, 11.081f, 3.574f, 13.18f)
                lineTo(11.47f, 21.076f)
                curveTo(11.763f, 21.368f, 12.237f, 21.368f, 12.53f, 21.076f)
                lineTo(20.432f, 13.179f)
                curveTo(22.526f, 11.073f, 22.53f, 7.679f, 20.43f, 5.58f)
                curveTo(18.327f, 3.477f, 14.923f, 3.477f, 12.82f, 5.58f)
                close()
            }
        }.build()

        return _Heart!!
    }

@Suppress("ObjectPropertyName")
private var _Heart: ImageVector? = null

@Preview
@Composable
private fun HeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.Heart, contentDescription = null)
    }
}
