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

public val FluentIcons.Filled.StackVertical: ImageVector
    get() {
        if (_StackVertical != null) {
            return _StackVertical!!
        }
        _StackVertical = ImageVector.Builder(
            name = "Filled.StackVertical",
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
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                curveTo(19.448f, 21f, 19f, 20.552f, 19f, 20f)
                verticalLineTo(16.25f)
                curveTo(19f, 15.56f, 18.44f, 15f, 17.75f, 15f)
                horizontalLineTo(6.25f)
                curveTo(5.56f, 15f, 5f, 15.56f, 5f, 16.25f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 4.552f, 21f, 4f, 21f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(6.25f)
                close()
                moveTo(5f, 13.249f)
                curveTo(5.385f, 13.089f, 5.807f, 13f, 6.25f, 13f)
                horizontalLineTo(17.75f)
                curveTo(18.193f, 13f, 18.615f, 13.089f, 19f, 13.249f)
                verticalLineTo(11.25f)
                curveTo(19f, 10.56f, 18.44f, 10f, 17.75f, 10f)
                horizontalLineTo(6.25f)
                curveTo(5.56f, 10f, 5f, 10.56f, 5f, 11.25f)
                verticalLineTo(13.249f)
                close()
                moveTo(19f, 6.25f)
                curveTo(19f, 5.56f, 18.44f, 5f, 17.75f, 5f)
                horizontalLineTo(6.25f)
                curveTo(5.56f, 5f, 5f, 5.56f, 5f, 6.25f)
                verticalLineTo(8.249f)
                curveTo(5.385f, 8.089f, 5.807f, 8f, 6.25f, 8f)
                horizontalLineTo(17.75f)
                curveTo(18.193f, 8f, 18.615f, 8.089f, 19f, 8.249f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _StackVertical!!
    }

@Suppress("ObjectPropertyName")
private var _StackVertical: ImageVector? = null

@Preview
@Composable
private fun StackVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StackVertical, contentDescription = null)
    }
}
