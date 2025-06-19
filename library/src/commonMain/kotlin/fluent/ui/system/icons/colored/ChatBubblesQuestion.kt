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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.ChatBubblesQuestion: ImageVector
    get() {
        if (_ChatBubblesQuestion != null) {
            return _ChatBubblesQuestion!!
        }
        _ChatBubblesQuestion = ImageVector.Builder(
            name = "Colored.ChatBubblesQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0.63f to Color(0xFF3D35B1),
                        0.85f to Color(0xFF6553C9),
                        1f to Color(0xFF7660D3)
                    ),
                    center = Offset(11.027f, 10.005f),
                    radius = 10.573f
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(22f, 13.5f)
                curveTo(22f, 9.358f, 18.642f, 6f, 14.5f, 6f)
                curveTo(10.358f, 6f, 7f, 9.358f, 7f, 13.5f)
                curveTo(7f, 17.642f, 10.358f, 21f, 14.5f, 21f)
                curveTo(15.6f, 21f, 16.646f, 20.763f, 17.589f, 20.336f)
                curveTo(18.847f, 20.627f, 20.202f, 20.876f, 20.825f, 20.987f)
                curveTo(21.513f, 21.11f, 22.112f, 20.506f, 21.978f, 19.817f)
                curveTo(21.861f, 19.208f, 21.599f, 17.9f, 21.297f, 16.675f)
                curveTo(21.748f, 15.71f, 22f, 14.634f, 22f, 13.5f)
                close()
                moveTo(14.517f, 18f)
                horizontalLineTo(14.483f)
                curveTo(14.488f, 18f, 14.494f, 18f, 14.5f, 18f)
                curveTo(14.506f, 18f, 14.511f, 18f, 14.517f, 18f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF0FAFFF),
                        1f to Color(0xFF2764E7)
                    ),
                    start = Offset(2f, 3f),
                    end = Offset(17.003f, 18f)
                ),
                pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2f, 10.5f)
                curveTo(2f, 6.358f, 5.358f, 3f, 9.5f, 3f)
                curveTo(13.642f, 3f, 17f, 6.358f, 17f, 10.5f)
                curveTo(17f, 14.642f, 13.642f, 18f, 9.5f, 18f)
                curveTo(8.4f, 18f, 7.354f, 17.763f, 6.411f, 17.336f)
                curveTo(5.153f, 17.627f, 3.798f, 17.876f, 3.175f, 17.987f)
                curveTo(2.487f, 18.11f, 1.888f, 17.506f, 2.022f, 16.817f)
                curveTo(2.14f, 16.208f, 2.401f, 14.9f, 2.703f, 13.675f)
                curveTo(2.252f, 12.71f, 2f, 11.634f, 2f, 10.5f)
                close()
                moveTo(9.483f, 15f)
                horizontalLineTo(9.517f)
                curveTo(9.512f, 15f, 9.506f, 15f, 9.5f, 15f)
                curveTo(9.494f, 15f, 9.489f, 15f, 9.483f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFDFDFD),
                        1f to Color(0xFFCCEAFF)
                    ),
                    start = Offset(7.437f, 6.158f),
                    end = Offset(9.996f, 15.321f)
                )
            ) {
                moveTo(7.091f, 7.396f)
                curveTo(7.354f, 6.909f, 7.703f, 6.542f, 8.144f, 6.306f)
                curveTo(8.578f, 6.075f, 9.045f, 6f, 9.5f, 6f)
                curveTo(10.026f, 6f, 10.638f, 6.173f, 11.132f, 6.578f)
                curveTo(11.649f, 7.001f, 12f, 7.651f, 12f, 8.499f)
                curveTo(12f, 9.474f, 11.311f, 10.003f, 10.923f, 10.301f)
                curveTo(10.893f, 10.324f, 10.865f, 10.346f, 10.839f, 10.367f)
                curveTo(10.414f, 10.7f, 10.25f, 10.879f, 10.25f, 11.249f)
                curveTo(10.25f, 11.663f, 9.914f, 11.999f, 9.5f, 11.999f)
                curveTo(9.086f, 11.999f, 8.75f, 11.663f, 8.75f, 11.249f)
                curveTo(8.75f, 10.115f, 9.461f, 9.541f, 9.912f, 9.187f)
                curveTo(10.425f, 8.784f, 10.5f, 8.694f, 10.5f, 8.499f)
                curveTo(10.5f, 8.102f, 10.352f, 7.878f, 10.181f, 7.738f)
                curveTo(9.987f, 7.579f, 9.724f, 7.5f, 9.5f, 7.5f)
                curveTo(9.205f, 7.5f, 9.002f, 7.549f, 8.851f, 7.63f)
                curveTo(8.708f, 7.706f, 8.556f, 7.841f, 8.409f, 8.111f)
                curveTo(8.212f, 8.475f, 7.757f, 8.61f, 7.393f, 8.413f)
                curveTo(7.029f, 8.215f, 6.893f, 7.76f, 7.091f, 7.396f)
                close()
                moveTo(9.5f, 12.999f)
                curveTo(10.053f, 12.999f, 10.5f, 13.447f, 10.5f, 13.999f)
                curveTo(10.5f, 14.552f, 10.053f, 14.999f, 9.5f, 14.999f)
                curveTo(8.948f, 14.999f, 8.5f, 14.552f, 8.5f, 13.999f)
                curveTo(8.5f, 13.447f, 8.948f, 12.999f, 9.5f, 12.999f)
                close()
            }
        }.build()

        return _ChatBubblesQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _ChatBubblesQuestion: ImageVector? = null

@Preview
@Composable
private fun ChatBubblesQuestionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.ChatBubblesQuestion, contentDescription = null)
    }
}
