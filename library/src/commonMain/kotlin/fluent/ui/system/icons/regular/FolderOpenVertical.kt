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

public val FluentIcons.Regular.FolderOpenVertical: ImageVector
    get() {
        if (_FolderOpenVertical != null) {
            return _FolderOpenVertical!!
        }
        _FolderOpenVertical = ImageVector.Builder(
            name = "Regular.FolderOpenVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3.5f)
                curveTo(18.716f, 3.5f, 19.5f, 4.284f, 19.5f, 5.25f)
                verticalLineTo(8.129f)
                curveTo(19.5f, 8.328f, 19.421f, 8.519f, 19.28f, 8.659f)
                lineTo(17.22f, 10.72f)
                curveTo(17.079f, 10.861f, 17f, 11.051f, 17f, 11.25f)
                verticalLineTo(16.75f)
                curveTo(17f, 17.717f, 16.216f, 18.5f, 15.25f, 18.5f)
                curveTo(15.164f, 18.5f, 15.081f, 18.515f, 15.004f, 18.541f)
                lineTo(15.004f, 8.719f)
                curveTo(15.004f, 7.379f, 14.29f, 6.141f, 13.129f, 5.471f)
                lineTo(9.716f, 3.5f)
                horizontalLineTo(17.75f)
                close()
                moveTo(6.212f, 2f)
                curveTo(4.434f, 2.021f, 3f, 3.468f, 3f, 5.25f)
                verticalLineTo(11f)
                curveTo(3f, 11.029f, 3.002f, 11.058f, 3.005f, 11.086f)
                verticalLineTo(16.281f)
                curveTo(3.005f, 17.621f, 3.72f, 18.859f, 4.88f, 19.529f)
                lineTo(10.129f, 22.56f)
                curveTo(12.234f, 23.775f, 14.85f, 22.334f, 14.998f, 19.957f)
                curveTo(15.077f, 19.985f, 15.161f, 20f, 15.25f, 20f)
                curveTo(17.045f, 20f, 18.5f, 18.545f, 18.5f, 16.75f)
                verticalLineTo(11.561f)
                lineTo(20.341f, 9.72f)
                curveTo(20.763f, 9.298f, 21f, 8.726f, 21f, 8.129f)
                verticalLineTo(5.25f)
                curveTo(21f, 3.455f, 19.545f, 2f, 17.75f, 2f)
                horizontalLineTo(6.29f)
                curveTo(6.264f, 2f, 6.238f, 2f, 6.212f, 2f)
                close()
                moveTo(13.504f, 8.719f)
                lineTo(13.504f, 19.745f)
                curveTo(13.504f, 21.092f, 12.046f, 21.934f, 10.879f, 21.26f)
                lineTo(5.63f, 18.23f)
                curveTo(4.934f, 17.828f, 4.505f, 17.085f, 4.505f, 16.281f)
                verticalLineTo(5.255f)
                curveTo(4.505f, 3.908f, 5.963f, 3.066f, 7.13f, 3.739f)
                lineTo(12.379f, 6.77f)
                curveTo(13.075f, 7.172f, 13.504f, 7.915f, 13.504f, 8.719f)
                close()
            }
        }.build()

        return _FolderOpenVertical!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpenVertical: ImageVector? = null

@Preview
@Composable
private fun FolderOpenVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FolderOpenVertical, contentDescription = null)
    }
}
