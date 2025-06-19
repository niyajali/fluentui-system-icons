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

public val FluentIcons.Filled.BookInformation: ImageVector
    get() {
        if (_BookInformation != null) {
            return _BookInformation!!
        }
        _BookInformation = ImageVector.Builder(
            name = "Filled.BookInformation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4.5f)
                curveTo(4f, 3.119f, 5.119f, 2f, 6.5f, 2f)
                horizontalLineTo(18f)
                curveTo(19.381f, 2f, 20.5f, 3.119f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.164f, 20.164f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.052f, 5.948f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 20.5f, 20.5f, 20.836f, 20.5f, 21.25f)
                curveTo(20.5f, 21.664f, 20.164f, 22f, 19.75f, 22f)
                horizontalLineTo(6.5f)
                curveTo(5.119f, 22f, 4f, 20.881f, 4f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(12.25f, 8f)
                curveTo(12.802f, 8f, 13.25f, 7.552f, 13.25f, 7f)
                curveTo(13.25f, 6.448f, 12.802f, 6f, 12.25f, 6f)
                curveTo(11.698f, 6f, 11.25f, 6.448f, 11.25f, 7f)
                curveTo(11.25f, 7.552f, 11.698f, 8f, 12.25f, 8f)
                close()
                moveTo(11.5f, 9.75f)
                lineTo(11.5f, 14.75f)
                curveTo(11.5f, 15.164f, 11.836f, 15.5f, 12.25f, 15.5f)
                curveTo(12.664f, 15.5f, 13f, 15.164f, 13f, 14.75f)
                verticalLineTo(9.75f)
                curveTo(13f, 9.336f, 12.664f, 9f, 12.25f, 9f)
                curveTo(11.836f, 9f, 11.5f, 9.336f, 11.5f, 9.75f)
                close()
            }
        }.build()

        return _BookInformation!!
    }

@Suppress("ObjectPropertyName")
private var _BookInformation: ImageVector? = null

@Preview
@Composable
private fun BookInformationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BookInformation, contentDescription = null)
    }
}
