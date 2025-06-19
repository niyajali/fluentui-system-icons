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

public val FluentIcons.Filled.EqualCircle: ImageVector
    get() {
        if (_EqualCircle != null) {
            return _EqualCircle!!
        }
        _EqualCircle = ImageVector.Builder(
            name = "Filled.EqualCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                close()
                moveTo(16.252f, 10.5f)
                horizontalLineTo(7.753f)
                curveTo(7.339f, 10.5f, 7.003f, 10.164f, 7.003f, 9.75f)
                curveTo(7.003f, 9.336f, 7.339f, 9f, 7.753f, 9f)
                lineTo(16.252f, 9f)
                curveTo(16.666f, 9f, 17.002f, 9.336f, 17.002f, 9.75f)
                curveTo(17.002f, 10.164f, 16.666f, 10.5f, 16.252f, 10.5f)
                close()
                moveTo(16.252f, 15f)
                horizontalLineTo(7.753f)
                curveTo(7.339f, 15f, 7.003f, 14.664f, 7.003f, 14.25f)
                curveTo(7.003f, 13.836f, 7.339f, 13.5f, 7.753f, 13.5f)
                horizontalLineTo(16.252f)
                curveTo(16.666f, 13.5f, 17.002f, 13.836f, 17.002f, 14.25f)
                curveTo(17.002f, 14.664f, 16.666f, 15f, 16.252f, 15f)
                close()
            }
        }.build()

        return _EqualCircle!!
    }

@Suppress("ObjectPropertyName")
private var _EqualCircle: ImageVector? = null

@Preview
@Composable
private fun EqualCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EqualCircle, contentDescription = null)
    }
}
