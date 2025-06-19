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

public val FluentIcons.Filled.Blur: ImageVector
    get() {
        if (_Blur != null) {
            return _Blur!!
        }
        _Blur = ImageVector.Builder(
            name = "Filled.Blur",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(13.84f, 3f, 15.551f, 3.552f, 16.977f, 4.5f)
                horizontalLineTo(12f)
                verticalLineTo(5.5f)
                horizontalLineTo(18.225f)
                curveTo(18.697f, 5.952f, 19.12f, 6.455f, 19.485f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(20.065f)
                curveTo(20.302f, 8.477f, 20.498f, 8.979f, 20.648f, 9.5f)
                horizontalLineTo(12f)
                verticalLineTo(10.5f)
                horizontalLineTo(20.876f)
                curveTo(20.957f, 10.988f, 21f, 11.489f, 21f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(20.945f)
                curveTo(20.888f, 13.514f, 20.788f, 14.016f, 20.648f, 14.5f)
                horizontalLineTo(12f)
                verticalLineTo(15.5f)
                horizontalLineTo(20.294f)
                curveTo(20.071f, 16.028f, 19.799f, 16.529f, 19.485f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(18.708f)
                curveTo(17.06f, 19.841f, 14.665f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                close()
            }
        }.build()

        return _Blur!!
    }

@Suppress("ObjectPropertyName")
private var _Blur: ImageVector? = null

@Preview
@Composable
private fun BlurPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Blur, contentDescription = null)
    }
}
