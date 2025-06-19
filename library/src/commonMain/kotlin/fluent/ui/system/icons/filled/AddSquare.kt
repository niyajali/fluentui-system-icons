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

public val FluentIcons.Filled.AddSquare: ImageVector
    get() {
        if (_AddSquare != null) {
            return _AddSquare!!
        }
        _AddSquare = ImageVector.Builder(
            name = "Filled.AddSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(12.75f, 7.75f)
                curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
                curveTo(11.586f, 7f, 11.25f, 7.336f, 11.25f, 7.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
                curveTo(7f, 12.414f, 7.336f, 12.75f, 7.75f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
                curveTo(12.414f, 17f, 12.75f, 16.664f, 12.75f, 16.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.586f, 16.664f, 11.25f, 16.25f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(7.75f)
                close()
            }
        }.build()

        return _AddSquare!!
    }

@Suppress("ObjectPropertyName")
private var _AddSquare: ImageVector? = null

@Preview
@Composable
private fun AddSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AddSquare, contentDescription = null)
    }
}
