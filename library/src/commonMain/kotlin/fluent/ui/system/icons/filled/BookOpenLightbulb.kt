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

public val FluentIcons.Filled.BookOpenLightbulb: ImageVector
    get() {
        if (_BookOpenLightbulb != null) {
            return _BookOpenLightbulb!!
        }
        _BookOpenLightbulb = ImageVector.Builder(
            name = "Filled.BookOpenLightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.9f, 21f)
                lineTo(20.741f, 21.794f)
                curveTo(20.601f, 22.495f, 19.985f, 23f, 19.271f, 23f)
                horizontalLineTo(18.729f)
                curveTo(18.015f, 23f, 17.399f, 22.495f, 17.259f, 21.794f)
                lineTo(17.1f, 21f)
                horizontalLineTo(20.9f)
                close()
                moveTo(10f, 4f)
                curveTo(10.768f, 4f, 11.469f, 4.289f, 12f, 4.764f)
                curveTo(12.531f, 4.289f, 13.232f, 4f, 14f, 4f)
                horizontalLineTo(20f)
                curveTo(21.105f, 4f, 22f, 4.895f, 22f, 6f)
                verticalLineTo(12f)
                curveTo(21.419f, 11.563f, 20.739f, 11.25f, 20f, 11.1f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                curveTo(13.448f, 6f, 13f, 6.448f, 13f, 7f)
                verticalLineTo(17f)
                curveTo(13f, 17.552f, 13.448f, 18f, 14f, 18f)
                horizontalLineTo(14.418f)
                curveTo(14.742f, 18.739f, 15.238f, 19.385f, 15.856f, 19.886f)
                lineTo(15.88f, 20f)
                horizontalLineTo(14f)
                curveTo(13.232f, 20f, 12.531f, 19.711f, 12f, 19.236f)
                curveTo(11.469f, 19.711f, 10.768f, 20f, 10f, 20f)
                horizontalLineTo(4f)
                curveTo(2.895f, 20f, 2f, 19.105f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
                horizontalLineTo(10f)
                close()
                moveTo(19f, 12f)
                curveTo(21.209f, 12f, 23f, 13.791f, 23f, 16f)
                curveTo(23f, 17.381f, 22.3f, 18.598f, 21.236f, 19.316f)
                lineTo(21.1f, 20f)
                horizontalLineTo(16.9f)
                lineTo(16.764f, 19.316f)
                curveTo(15.7f, 18.598f, 15f, 17.381f, 15f, 16f)
                curveTo(15f, 13.791f, 16.791f, 12f, 19f, 12f)
                close()
                moveTo(4f, 18f)
                horizontalLineTo(10f)
                curveTo(10.552f, 18f, 11f, 17.552f, 11f, 17f)
                verticalLineTo(7f)
                curveTo(11f, 6.448f, 10.552f, 6f, 10f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _BookOpenLightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenLightbulb: ImageVector? = null

@Preview
@Composable
private fun BookOpenLightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookOpenLightbulb, contentDescription = null)
    }
}
