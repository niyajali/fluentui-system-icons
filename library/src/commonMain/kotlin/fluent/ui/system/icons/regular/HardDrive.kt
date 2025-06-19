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

public val FluentIcons.Regular.HardDrive: ImageVector
    get() {
        if (_HardDrive != null) {
            return _HardDrive!!
        }
        _HardDrive = ImageVector.Builder(
            name = "Regular.HardDrive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.415f, 5.27f)
                curveTo(5.791f, 4.493f, 6.578f, 4f, 7.441f, 4f)
                horizontalLineTo(16.559f)
                curveTo(17.422f, 4f, 18.209f, 4.493f, 18.585f, 5.27f)
                lineTo(21.676f, 11.658f)
                curveTo(21.889f, 12.099f, 22f, 12.583f, 22f, 13.073f)
                verticalLineTo(16.75f)
                curveTo(22f, 17.993f, 20.993f, 19f, 19.75f, 19f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 19f, 2f, 17.993f, 2f, 16.75f)
                verticalLineTo(13.073f)
                curveTo(2f, 12.583f, 2.111f, 12.099f, 2.324f, 11.658f)
                lineTo(5.415f, 5.27f)
                close()
                moveTo(17.235f, 5.923f)
                curveTo(17.109f, 5.664f, 16.847f, 5.5f, 16.559f, 5.5f)
                horizontalLineTo(7.441f)
                curveTo(7.153f, 5.5f, 6.891f, 5.664f, 6.765f, 5.923f)
                lineTo(4.309f, 11f)
                horizontalLineTo(19.691f)
                lineTo(17.235f, 5.923f)
                close()
                moveTo(3.5f, 13.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.164f, 3.836f, 17.5f, 4.25f, 17.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 17.5f, 20.5f, 17.164f, 20.5f, 16.75f)
                verticalLineTo(13.25f)
                curveTo(20.5f, 12.836f, 20.164f, 12.5f, 19.75f, 12.5f)
                horizontalLineTo(4.25f)
                curveTo(3.836f, 12.5f, 3.5f, 12.836f, 3.5f, 13.25f)
                close()
                moveTo(18f, 16f)
                curveTo(18.552f, 16f, 19f, 15.552f, 19f, 15f)
                curveTo(19f, 14.448f, 18.552f, 14f, 18f, 14f)
                curveTo(17.448f, 14f, 17f, 14.448f, 17f, 15f)
                curveTo(17f, 15.552f, 17.448f, 16f, 18f, 16f)
                close()
            }
        }.build()

        return _HardDrive!!
    }

@Suppress("ObjectPropertyName")
private var _HardDrive: ImageVector? = null

@Preview
@Composable
private fun HardDrivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HardDrive, contentDescription = null)
    }
}
