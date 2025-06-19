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

public val FluentIcons.Filled.TextUnderlineCharacterU: ImageVector
    get() {
        if (_TextUnderlineCharacterU != null) {
            return _TextUnderlineCharacterU!!
        }
        _TextUnderlineCharacterU = ImageVector.Builder(
            name = "Filled.TextUnderlineCharacterU",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 5f)
                curveTo(9f, 4.448f, 8.552f, 4f, 8f, 4f)
                curveTo(7.448f, 4f, 7f, 4.448f, 7f, 5f)
                verticalLineTo(11.5f)
                curveTo(7f, 14.261f, 9.239f, 16.5f, 12f, 16.5f)
                curveTo(14.761f, 16.5f, 17f, 14.261f, 17f, 11.5f)
                verticalLineTo(5f)
                curveTo(17f, 4.448f, 16.552f, 4f, 16f, 4f)
                curveTo(15.448f, 4f, 15f, 4.448f, 15f, 5f)
                verticalLineTo(11.5f)
                curveTo(15f, 13.157f, 13.657f, 14.5f, 12f, 14.5f)
                curveTo(10.343f, 14.5f, 9f, 13.157f, 9f, 11.5f)
                verticalLineTo(5f)
                close()
                moveTo(7f, 18f)
                curveTo(6.448f, 18f, 6f, 18.448f, 6f, 19f)
                curveTo(6f, 19.552f, 6.448f, 20f, 7f, 20f)
                horizontalLineTo(17f)
                curveTo(17.552f, 20f, 18f, 19.552f, 18f, 19f)
                curveTo(18f, 18.448f, 17.552f, 18f, 17f, 18f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _TextUnderlineCharacterU!!
    }

@Suppress("ObjectPropertyName")
private var _TextUnderlineCharacterU: ImageVector? = null

@Preview
@Composable
private fun TextUnderlineCharacterUPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextUnderlineCharacterU, contentDescription = null)
    }
}
