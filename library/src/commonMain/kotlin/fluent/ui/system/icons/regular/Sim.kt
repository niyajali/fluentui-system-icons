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

public val FluentIcons.Regular.Sim: ImageVector
    get() {
        if (_Sim != null) {
            return _Sim!!
        }
        _Sim = ImageVector.Builder(
            name = "Regular.Sim",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.75f, 10f)
                curveTo(8.231f, 10f, 7f, 11.231f, 7f, 12.75f)
                verticalLineTo(16.25f)
                curveTo(7f, 17.769f, 8.231f, 19f, 9.75f, 19f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 19f, 17f, 17.769f, 17f, 16.25f)
                verticalLineTo(12.75f)
                curveTo(17f, 11.231f, 15.769f, 10f, 14.25f, 10f)
                horizontalLineTo(9.75f)
                close()
                moveTo(8.5f, 12.75f)
                curveTo(8.5f, 12.06f, 9.06f, 11.5f, 9.75f, 11.5f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.75f)
                close()
                moveTo(8.5f, 15.5f)
                horizontalLineTo(12f)
                verticalLineTo(17.5f)
                horizontalLineTo(9.75f)
                curveTo(9.06f, 17.5f, 8.5f, 16.94f, 8.5f, 16.25f)
                verticalLineTo(15.5f)
                close()
                moveTo(13.5f, 17.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.25f)
                curveTo(14.94f, 11.5f, 15.5f, 12.06f, 15.5f, 12.75f)
                verticalLineTo(16.25f)
                curveTo(15.5f, 16.94f, 14.94f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(13.5f)
                close()
                moveTo(7.25f, 2f)
                curveTo(5.455f, 2f, 4f, 3.455f, 4f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(4f, 20.545f, 5.455f, 22f, 7.25f, 22f)
                horizontalLineTo(16.75f)
                curveTo(18.545f, 22f, 20f, 20.545f, 20f, 18.75f)
                verticalLineTo(9.286f)
                curveTo(20f, 8.424f, 19.658f, 7.597f, 19.048f, 6.987f)
                lineTo(15.013f, 2.952f)
                curveTo(14.403f, 2.342f, 13.576f, 2f, 12.715f, 2f)
                horizontalLineTo(7.25f)
                close()
                moveTo(5.5f, 5.25f)
                curveTo(5.5f, 4.284f, 6.284f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(12.715f)
                curveTo(13.179f, 3.5f, 13.624f, 3.684f, 13.952f, 4.013f)
                lineTo(17.987f, 8.048f)
                curveTo(18.316f, 8.376f, 18.5f, 8.821f, 18.5f, 9.286f)
                verticalLineTo(18.75f)
                curveTo(18.5f, 19.716f, 17.716f, 20.5f, 16.75f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(6.284f, 20.5f, 5.5f, 19.716f, 5.5f, 18.75f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _Sim!!
    }

@Suppress("ObjectPropertyName")
private var _Sim: ImageVector? = null

@Preview
@Composable
private fun SimPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Sim, contentDescription = null)
    }
}
