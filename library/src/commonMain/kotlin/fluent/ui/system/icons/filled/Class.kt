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

public val FluentIcons.Filled.Class: ImageVector
    get() {
        if (_Class != null) {
            return _Class!!
        }
        _Class = ImageVector.Builder(
            name = "Filled.Class",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.25f, 2.001f)
                curveTo(18.769f, 2.001f, 20f, 3.232f, 20f, 4.751f)
                verticalLineTo(19.249f)
                curveTo(20f, 20.767f, 18.769f, 21.999f, 17.25f, 21.999f)
                horizontalLineTo(6.75f)
                curveTo(5.231f, 21.999f, 4f, 20.767f, 4f, 19.249f)
                verticalLineTo(4.751f)
                curveTo(4f, 3.232f, 5.231f, 2.001f, 6.75f, 2.001f)
                lineTo(7.041f, 2f)
                verticalLineTo(10.167f)
                curveTo(7.041f, 10.915f, 7.832f, 11.181f, 8.36f, 10.906f)
                lineTo(8.45f, 10.852f)
                lineTo(10.543f, 9.655f)
                lineTo(12.684f, 10.884f)
                curveTo(13.129f, 11.193f, 13.944f, 10.985f, 14.033f, 10.294f)
                lineTo(14.041f, 10.167f)
                verticalLineTo(2f)
                lineTo(17.25f, 2.001f)
                close()
                moveTo(12.541f, 2f)
                verticalLineTo(9.076f)
                lineTo(10.92f, 8.144f)
                curveTo(10.693f, 8.035f, 10.385f, 8.038f, 10.127f, 8.166f)
                lineTo(10.02f, 8.229f)
                lineTo(8.541f, 9.075f)
                verticalLineTo(2f)
                horizontalLineTo(12.541f)
                close()
            }
        }.build()

        return _Class!!
    }

@Suppress("ObjectPropertyName")
private var _Class: ImageVector? = null

@Preview
@Composable
private fun ClassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Class, contentDescription = null)
    }
}
