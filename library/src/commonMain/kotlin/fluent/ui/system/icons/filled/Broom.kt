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

public val FluentIcons.Filled.Broom: ImageVector
    get() {
        if (_Broom != null) {
            return _Broom!!
        }
        _Broom = ImageVector.Builder(
            name = "Filled.Broom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22.453f, 1.923f)
                curveTo(22.746f, 2.216f, 22.746f, 2.691f, 22.453f, 2.983f)
                lineTo(16.14f, 9.296f)
                curveTo(15.994f, 9.116f, 15.836f, 8.941f, 15.668f, 8.773f)
                curveTo(15.478f, 8.583f, 15.279f, 8.406f, 15.072f, 8.243f)
                lineTo(21.393f, 1.923f)
                curveTo(21.686f, 1.63f, 22.16f, 1.63f, 22.453f, 1.923f)
                close()
                moveTo(15.029f, 9.347f)
                curveTo(12.783f, 7.102f, 9.142f, 7.102f, 6.897f, 9.347f)
                lineTo(6.653f, 9.591f)
                lineTo(14.785f, 17.723f)
                lineTo(15.029f, 17.479f)
                curveTo(17.274f, 15.234f, 17.274f, 11.593f, 15.029f, 9.347f)
                close()
                moveTo(1.885f, 12.966f)
                lineTo(5.498f, 10.557f)
                lineTo(13.819f, 18.878f)
                lineTo(11.41f, 22.491f)
                curveTo(11.285f, 22.678f, 11.084f, 22.799f, 10.86f, 22.822f)
                curveTo(10.636f, 22.844f, 10.415f, 22.764f, 10.256f, 22.606f)
                lineTo(1.77f, 14.12f)
                curveTo(1.612f, 13.962f, 1.532f, 13.74f, 1.554f, 13.516f)
                curveTo(1.577f, 13.292f, 1.698f, 13.091f, 1.885f, 12.966f)
                close()
            }
        }.build()

        return _Broom!!
    }

@Suppress("ObjectPropertyName")
private var _Broom: ImageVector? = null

@Preview
@Composable
private fun BroomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Broom, contentDescription = null)
    }
}
