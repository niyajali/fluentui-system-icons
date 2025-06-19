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

public val FluentIcons.Filled.AddCircle: ImageVector
    get() {
        if (_AddCircle != null) {
            return _AddCircle!!
        }
        _AddCircle = ImageVector.Builder(
            name = "Filled.AddCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(12f, 7f)
                curveTo(11.62f, 7f, 11.307f, 7.282f, 11.257f, 7.648f)
                lineTo(11.25f, 7.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11.25f, 7f, 11.586f, 7f, 12f)
                curveTo(7f, 12.38f, 7.282f, 12.693f, 7.648f, 12.743f)
                lineTo(7.75f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 16.664f, 11.586f, 17f, 12f, 17f)
                curveTo(12.38f, 17f, 12.693f, 16.718f, 12.743f, 16.352f)
                lineTo(12.75f, 16.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 12.75f, 17f, 12.414f, 17f, 12f)
                curveTo(17f, 11.62f, 16.718f, 11.307f, 16.352f, 11.257f)
                lineTo(16.25f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(7.75f)
                curveTo(12.75f, 7.336f, 12.414f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _AddCircle!!
    }

@Suppress("ObjectPropertyName")
private var _AddCircle: ImageVector? = null

@Preview
@Composable
private fun AddCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AddCircle, contentDescription = null)
    }
}
