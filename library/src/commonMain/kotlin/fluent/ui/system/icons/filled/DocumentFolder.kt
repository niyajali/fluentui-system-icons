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

public val FluentIcons.Filled.DocumentFolder: ImageVector
    get() {
        if (_DocumentFolder != null) {
            return _DocumentFolder!!
        }
        _DocumentFolder = ImageVector.Builder(
            name = "Filled.DocumentFolder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.5f, 6.75f)
                lineTo(18.497f, 4.627f)
                curveTo(19.373f, 4.935f, 20f, 5.769f, 20f, 6.75f)
                verticalLineTo(14.249f)
                curveTo(19.615f, 14.089f, 19.193f, 14f, 18.75f, 14f)
                horizontalLineTo(18.5f)
                verticalLineTo(6.75f)
                close()
                moveTo(4f, 4.25f)
                verticalLineTo(7.249f)
                curveTo(4.385f, 7.089f, 4.807f, 7f, 5.25f, 7f)
                horizontalLineTo(8.096f)
                curveTo(9f, 7f, 9.863f, 7.376f, 10.477f, 8.039f)
                lineTo(16.013f, 14f)
                horizontalLineTo(17.5f)
                verticalLineTo(4.25f)
                curveTo(17.5f, 3.007f, 16.493f, 2f, 15.25f, 2f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                close()
                moveTo(5.25f, 8f)
                curveTo(4.007f, 8f, 3f, 9.007f, 3f, 10.25f)
                verticalLineTo(18.75f)
                curveTo(3f, 20.545f, 4.455f, 22f, 6.25f, 22f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 22f, 21f, 20.545f, 21f, 18.75f)
                verticalLineTo(17.25f)
                curveTo(21f, 16.007f, 19.993f, 15f, 18.75f, 15f)
                horizontalLineTo(15.904f)
                curveTo(15.696f, 15f, 15.496f, 14.913f, 15.354f, 14.76f)
                lineTo(9.745f, 8.719f)
                curveTo(9.319f, 8.261f, 8.722f, 8f, 8.096f, 8f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _DocumentFolder!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFolder: ImageVector? = null

@Preview
@Composable
private fun DocumentFolderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentFolder, contentDescription = null)
    }
}
