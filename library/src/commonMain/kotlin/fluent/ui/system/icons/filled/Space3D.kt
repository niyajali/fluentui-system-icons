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

public val FluentIcons.Filled.Space3D: ImageVector
    get() {
        if (_Space3D != null) {
            return _Space3D!!
        }
        _Space3D = ImageVector.Builder(
            name = "Filled.Space3D",
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
                verticalLineTo(15f)
                horizontalLineTo(20.188f)
                lineTo(17.938f, 12f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(12f)
                horizontalLineTo(6.063f)
                lineTo(3.813f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                close()
                moveTo(15.692f, 16.5f)
                horizontalLineTo(21f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(17.083f)
                lineTo(16.716f, 19.776f)
                lineTo(15.692f, 16.5f)
                close()
                moveTo(18.313f, 15f)
                horizontalLineTo(15.223f)
                lineTo(14.286f, 12f)
                horizontalLineTo(16.063f)
                lineTo(18.313f, 15f)
                close()
                moveTo(10.523f, 15f)
                horizontalLineTo(13.652f)
                lineTo(12.714f, 12f)
                horizontalLineTo(11.273f)
                lineTo(10.523f, 15f)
                close()
                moveTo(14.12f, 16.5f)
                horizontalLineTo(10.148f)
                lineTo(9.023f, 21f)
                horizontalLineTo(15.517f)
                lineTo(15.283f, 20.22f)
                lineTo(14.12f, 16.5f)
                close()
                moveTo(9.727f, 12f)
                lineTo(8.977f, 15f)
                horizontalLineTo(5.688f)
                lineTo(7.938f, 12f)
                horizontalLineTo(9.727f)
                close()
                moveTo(8.602f, 16.5f)
                horizontalLineTo(3f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(7.477f)
                lineTo(8.602f, 16.5f)
                close()
            }
        }.build()

        return _Space3D!!
    }

@Suppress("ObjectPropertyName")
private var _Space3D: ImageVector? = null

@Preview
@Composable
private fun Space3DPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Space3D, contentDescription = null)
    }
}
