package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.KeyboardShift: ImageVector
    get() {
        if (_KeyboardShift != null) {
            return _KeyboardShift!!
        }
        _KeyboardShift = ImageVector.Builder(
            name = "Regular.KeyboardShift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.677f, 2.603f)
                curveTo(11.375f, 1.799f, 12.623f, 1.799f, 13.321f, 2.603f)
                lineTo(21.567f, 12.107f)
                curveTo(22.55f, 13.24f, 21.745f, 15.004f, 20.245f, 15.004f)
                horizontalLineTo(17f)
                verticalLineTo(20.251f)
                curveTo(17f, 21.217f, 16.216f, 22.001f, 15.25f, 22.001f)
                horizontalLineTo(8.75f)
                curveTo(7.783f, 22.001f, 7f, 21.217f, 7f, 20.251f)
                verticalLineTo(15.004f)
                horizontalLineTo(3.754f)
                curveTo(2.254f, 15.004f, 1.449f, 13.24f, 2.432f, 12.107f)
                lineTo(10.677f, 2.603f)
                close()
                moveTo(12.188f, 3.586f)
                curveTo(12.089f, 3.471f, 11.91f, 3.471f, 11.811f, 3.586f)
                lineTo(3.565f, 13.09f)
                curveTo(3.425f, 13.252f, 3.54f, 13.504f, 3.754f, 13.504f)
                horizontalLineTo(7.75f)
                curveTo(8.164f, 13.504f, 8.5f, 13.84f, 8.5f, 14.254f)
                verticalLineTo(20.251f)
                curveTo(8.5f, 20.389f, 8.612f, 20.501f, 8.75f, 20.501f)
                horizontalLineTo(15.25f)
                curveTo(15.388f, 20.501f, 15.5f, 20.389f, 15.5f, 20.251f)
                verticalLineTo(14.254f)
                curveTo(15.5f, 13.84f, 15.836f, 13.504f, 16.25f, 13.504f)
                horizontalLineTo(20.245f)
                curveTo(20.459f, 13.504f, 20.574f, 13.252f, 20.434f, 13.09f)
                lineTo(12.188f, 3.586f)
                close()
            }
        }.build()

        return _KeyboardShift!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardShift: ImageVector? = null

@Preview
@Composable
private fun KeyboardShiftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.KeyboardShift, contentDescription = null)
    }
}
