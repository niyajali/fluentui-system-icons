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

public val FluentIcons.Filled.ArrowTrendingWrench: ImageVector
    get() {
        if (_ArrowTrendingWrench != null) {
            return _ArrowTrendingWrench!!
        }
        _ArrowTrendingWrench = ImageVector.Builder(
            name = "Filled.ArrowTrendingWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                lineTo(15f, 3f)
                curveTo(14.448f, 3f, 14f, 3.448f, 14f, 4f)
                curveTo(14f, 4.552f, 14.448f, 5f, 15f, 5f)
                lineTo(17.586f, 5f)
                lineTo(12.5f, 10.086f)
                lineTo(10.707f, 8.293f)
                curveTo(10.52f, 8.105f, 10.265f, 8f, 10f, 8f)
                curveTo(9.735f, 8f, 9.48f, 8.105f, 9.293f, 8.293f)
                lineTo(3.293f, 14.293f)
                curveTo(2.902f, 14.683f, 2.902f, 15.317f, 3.293f, 15.707f)
                curveTo(3.683f, 16.098f, 4.317f, 16.098f, 4.707f, 15.707f)
                lineTo(10f, 10.414f)
                lineTo(11.793f, 12.207f)
                curveTo(11.98f, 12.395f, 12.235f, 12.5f, 12.5f, 12.5f)
                curveTo(12.765f, 12.5f, 13.02f, 12.395f, 13.207f, 12.207f)
                lineTo(19f, 6.414f)
                lineTo(19f, 9f)
                curveTo(19f, 9.552f, 19.448f, 10f, 20f, 10f)
                curveTo(20.552f, 10f, 21f, 9.552f, 21f, 9f)
                lineTo(21f, 4f)
                close()
                moveTo(20.48f, 11.833f)
                curveTo(20.731f, 11.582f, 20.645f, 11.16f, 20.299f, 11.084f)
                curveTo(19.012f, 10.804f, 17.614f, 11.163f, 16.614f, 12.164f)
                curveTo(15.427f, 13.351f, 15.142f, 15.098f, 15.759f, 16.555f)
                lineTo(12.018f, 20.296f)
                curveTo(11.432f, 20.882f, 11.432f, 21.831f, 12.018f, 22.417f)
                curveTo(12.604f, 23.003f, 13.553f, 23.003f, 14.139f, 22.417f)
                lineTo(17.881f, 18.676f)
                curveTo(19.337f, 19.292f, 21.084f, 19.007f, 22.271f, 17.82f)
                curveTo(23.271f, 16.82f, 23.631f, 15.422f, 23.35f, 14.136f)
                curveTo(23.275f, 13.789f, 22.852f, 13.704f, 22.601f, 13.954f)
                lineTo(20.857f, 15.699f)
                curveTo(20.271f, 16.285f, 19.321f, 16.285f, 18.735f, 15.699f)
                curveTo(18.149f, 15.113f, 18.149f, 14.164f, 18.735f, 13.578f)
                lineTo(20.48f, 11.833f)
                close()
            }
        }.build()

        return _ArrowTrendingWrench!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTrendingWrench: ImageVector? = null

@Preview
@Composable
private fun ArrowTrendingWrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowTrendingWrench, contentDescription = null)
    }
}
