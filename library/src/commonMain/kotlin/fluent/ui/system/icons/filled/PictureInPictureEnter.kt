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

public val FluentIcons.Filled.PictureInPictureEnter: ImageVector
    get() {
        if (_PictureInPictureEnter != null) {
            return _PictureInPictureEnter!!
        }
        _PictureInPictureEnter = ImageVector.Builder(
            name = "Filled.PictureInPictureEnter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 3f)
                curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
                verticalLineTo(15.75f)
                curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                curveTo(11f, 13.343f, 12.343f, 12f, 14f, 12f)
                horizontalLineTo(21f)
                curveTo(21.351f, 12f, 21.687f, 12.06f, 22f, 12.171f)
                verticalLineTo(6.25f)
                curveTo(22f, 4.455f, 20.545f, 3f, 18.75f, 3f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.28f, 6.22f)
                lineTo(9.5f, 9.439f)
                verticalLineTo(7.75f)
                curveTo(9.5f, 7.336f, 9.836f, 7f, 10.25f, 7f)
                curveTo(10.664f, 7f, 11f, 7.336f, 11f, 7.75f)
                verticalLineTo(11.25f)
                curveTo(11f, 11.664f, 10.664f, 12f, 10.25f, 12f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12f, 6f, 11.664f, 6f, 11.25f)
                curveTo(6f, 10.836f, 6.336f, 10.5f, 6.75f, 10.5f)
                horizontalLineTo(8.439f)
                lineTo(5.22f, 7.28f)
                curveTo(4.927f, 6.987f, 4.927f, 6.513f, 5.22f, 6.22f)
                curveTo(5.513f, 5.927f, 5.987f, 5.927f, 6.28f, 6.22f)
                close()
                moveTo(22f, 13.268f)
                curveTo(21.706f, 13.097f, 21.364f, 13f, 21f, 13f)
                horizontalLineTo(14f)
                curveTo(12.895f, 13f, 12f, 13.895f, 12f, 15f)
                verticalLineTo(20f)
                curveTo(12f, 21.105f, 12.895f, 22f, 14f, 22f)
                horizontalLineTo(21f)
                curveTo(22.105f, 22f, 23f, 21.105f, 23f, 20f)
                verticalLineTo(15f)
                curveTo(23f, 14.26f, 22.598f, 13.613f, 22f, 13.268f)
                close()
            }
        }.build()

        return _PictureInPictureEnter!!
    }

@Suppress("ObjectPropertyName")
private var _PictureInPictureEnter: ImageVector? = null

@Preview
@Composable
private fun PictureInPictureEnterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PictureInPictureEnter, contentDescription = null)
    }
}
