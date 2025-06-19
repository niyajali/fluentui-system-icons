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

public val FluentIcons.Filled.SelectAllOff: ImageVector
    get() {
        if (_SelectAllOff != null) {
            return _SelectAllOff!!
        }
        _SelectAllOff = ImageVector.Builder(
            name = "Filled.SelectAllOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(3f, 17.545f, 4.455f, 19f, 6.25f, 19f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 19f, 19f, 17.545f, 19f, 15.75f)
                verticalLineTo(6.25f)
                curveTo(19f, 4.455f, 17.545f, 3f, 15.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(9.241f, 21.5f)
                curveTo(8.09f, 21.5f, 7.078f, 20.902f, 6.5f, 19.999f)
                horizontalLineTo(9.216f)
                lineTo(9.241f, 19.999f)
                horizontalLineTo(16.246f)
                curveTo(18.319f, 19.999f, 19.999f, 18.319f, 19.999f, 16.246f)
                verticalLineTo(6.5f)
                curveTo(20.902f, 7.078f, 21.5f, 8.09f, 21.5f, 9.241f)
                verticalLineTo(16.246f)
                curveTo(21.5f, 19.148f, 19.148f, 21.5f, 16.246f, 21.5f)
                horizontalLineTo(9.241f)
                close()
            }
        }.build()

        return _SelectAllOff!!
    }

@Suppress("ObjectPropertyName")
private var _SelectAllOff: ImageVector? = null

@Preview
@Composable
private fun SelectAllOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SelectAllOff, contentDescription = null)
    }
}
