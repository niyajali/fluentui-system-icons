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

public val FluentIcons.Regular.DoorArrowLeft: ImageVector
    get() {
        if (_DoorArrowLeft != null) {
            return _DoorArrowLeft!!
        }
        _DoorArrowLeft = ImageVector.Builder(
            name = "Regular.DoorArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 2f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
                horizontalLineTo(12.81f)
                curveTo(12.383f, 21.556f, 12.019f, 21.051f, 11.732f, 20.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 3.5f, 18.5f, 3.836f, 18.5f, 4.25f)
                verticalLineTo(11.076f)
                curveTo(19.023f, 11.157f, 19.526f, 11.3f, 20f, 11.498f)
                verticalLineTo(4.25f)
                curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                close()
                moveTo(21f, 17.5f)
                curveTo(21f, 17.776f, 20.776f, 18f, 20.5f, 18f)
                horizontalLineTo(15.707f)
                lineTo(17.354f, 19.646f)
                curveTo(17.549f, 19.842f, 17.549f, 20.158f, 17.354f, 20.354f)
                curveTo(17.158f, 20.549f, 16.842f, 20.549f, 16.646f, 20.354f)
                lineTo(14.146f, 17.854f)
                curveTo(13.951f, 17.658f, 13.951f, 17.342f, 14.146f, 17.146f)
                lineTo(16.646f, 14.646f)
                curveTo(16.842f, 14.451f, 17.158f, 14.451f, 17.354f, 14.646f)
                curveTo(17.549f, 14.842f, 17.549f, 15.158f, 17.354f, 15.354f)
                lineTo(15.707f, 17f)
                horizontalLineTo(20.5f)
                curveTo(20.776f, 17f, 21f, 17.224f, 21f, 17.5f)
                close()
                moveTo(8.5f, 13.25f)
                curveTo(9.328f, 13.25f, 10f, 12.578f, 10f, 11.75f)
                curveTo(10f, 10.922f, 9.328f, 10.25f, 8.5f, 10.25f)
                curveTo(7.672f, 10.25f, 7f, 10.922f, 7f, 11.75f)
                curveTo(7f, 12.578f, 7.672f, 13.25f, 8.5f, 13.25f)
                close()
            }
        }.build()

        return _DoorArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _DoorArrowLeft: ImageVector? = null

@Preview
@Composable
private fun DoorArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DoorArrowLeft, contentDescription = null)
    }
}
