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

public val FluentIcons.Filled.Cursor: ImageVector
    get() {
        if (_Cursor != null) {
            return _Cursor!!
        }
        _Cursor = ImageVector.Builder(
            name = "Filled.Cursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.921f, 2.299f)
                curveTo(6.936f, 1.533f, 5.5f, 2.235f, 5.5f, 3.483f)
                verticalLineTo(20.492f)
                curveTo(5.5f, 21.914f, 7.294f, 22.538f, 8.177f, 21.422f)
                lineTo(12.368f, 16.122f)
                curveTo(12.681f, 15.726f, 13.157f, 15.496f, 13.662f, 15.496f)
                horizontalLineTo(20.514f)
                curveTo(21.942f, 15.496f, 22.563f, 13.689f, 21.435f, 12.812f)
                lineTo(7.921f, 2.299f)
                close()
            }
        }.build()

        return _Cursor!!
    }

@Suppress("ObjectPropertyName")
private var _Cursor: ImageVector? = null

@Preview
@Composable
private fun CursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Cursor, contentDescription = null)
    }
}
