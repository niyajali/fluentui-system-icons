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

public val FluentIcons.Regular.Checkbox1: ImageVector
    get() {
        if (_Checkbox1 != null) {
            return _Checkbox1!!
        }
        _Checkbox1 = ImageVector.Builder(
            name = "Regular.Checkbox1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 3f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(18.394f, 21f, 18.995f, 20.813f, 19.5f, 20.489f)
                verticalLineTo(18.832f)
                curveTo(19.337f, 18.909f, 19.165f, 18.959f, 18.991f, 18.984f)
                curveTo(18.674f, 19.302f, 18.235f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(14.409f)
                lineTo(20.157f, 13.884f)
                curveTo(20.312f, 13.759f, 20.485f, 13.664f, 20.667f, 13.6f)
                curveTo(20.775f, 13.562f, 20.887f, 13.534f, 21f, 13.518f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17.28f, 9.281f)
                curveTo(17.573f, 8.988f, 17.573f, 8.513f, 17.281f, 8.22f)
                curveTo(16.988f, 7.927f, 16.513f, 7.927f, 16.22f, 8.219f)
                lineTo(9.997f, 14.436f)
                lineTo(7.781f, 12.22f)
                curveTo(7.488f, 11.927f, 7.013f, 11.927f, 6.72f, 12.22f)
                curveTo(6.427f, 12.512f, 6.427f, 12.987f, 6.72f, 13.28f)
                lineTo(9.466f, 16.026f)
                curveTo(9.759f, 16.319f, 10.233f, 16.319f, 10.526f, 16.027f)
                lineTo(17.28f, 9.281f)
                close()
                moveTo(21f, 14.543f)
                curveTo(20.922f, 14.57f, 20.848f, 14.611f, 20.781f, 14.664f)
                lineTo(18.281f, 16.664f)
                curveTo(17.958f, 16.923f, 17.906f, 17.395f, 18.164f, 17.719f)
                curveTo(18.423f, 18.042f, 18.895f, 18.094f, 19.219f, 17.836f)
                lineTo(20.5f, 16.81f)
                verticalLineTo(21.25f)
                curveTo(20.5f, 21.664f, 20.836f, 22f, 21.25f, 22f)
                curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
                verticalLineTo(15.25f)
                curveTo(22f, 14.962f, 21.835f, 14.699f, 21.575f, 14.574f)
                curveTo(21.392f, 14.486f, 21.185f, 14.477f, 21f, 14.543f)
                close()
            }
        }.build()

        return _Checkbox1!!
    }

@Suppress("ObjectPropertyName")
private var _Checkbox1: ImageVector? = null

@Preview
@Composable
private fun Checkbox1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Checkbox1, contentDescription = null)
    }
}
