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

public val FluentIcons.Regular.BorderBottomThick: ImageVector
    get() {
        if (_BorderBottomThick != null) {
            return _BorderBottomThick!!
        }
        _BorderBottomThick = ImageVector.Builder(
            name = "Regular.BorderBottomThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 3.75f)
                curveTo(14f, 4.164f, 13.664f, 4.5f, 13.25f, 4.5f)
                lineTo(10.75f, 4.5f)
                curveTo(10.336f, 4.5f, 10f, 4.164f, 10f, 3.75f)
                curveTo(10f, 3.336f, 10.336f, 3f, 10.75f, 3f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 3f, 14f, 3.336f, 14f, 3.75f)
                close()
                moveTo(4.5f, 10.75f)
                curveTo(4.5f, 10.336f, 4.164f, 10f, 3.75f, 10f)
                curveTo(3.336f, 10f, 3f, 10.336f, 3f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(3f, 13.664f, 3.336f, 14f, 3.75f, 14f)
                curveTo(4.164f, 14f, 4.5f, 13.664f, 4.5f, 13.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(19.5f, 10.75f)
                curveTo(19.5f, 10.336f, 19.836f, 10f, 20.25f, 10f)
                curveTo(20.664f, 10f, 21f, 10.336f, 21f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(21f, 13.664f, 20.664f, 14f, 20.25f, 14f)
                curveTo(19.836f, 14f, 19.5f, 13.664f, 19.5f, 13.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(6.25f, 3f)
                curveTo(6.664f, 3f, 7f, 3.336f, 7f, 3.75f)
                curveTo(7f, 4.164f, 6.664f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 6.664f, 4.164f, 7f, 3.75f, 7f)
                curveTo(3.336f, 7f, 3f, 6.664f, 3f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17f, 3.75f)
                curveTo(17f, 3.336f, 17.336f, 3f, 17.75f, 3f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 6.664f, 20.664f, 7f, 20.25f, 7f)
                curveTo(19.836f, 7f, 19.5f, 6.664f, 19.5f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 4.5f, 17f, 4.164f, 17f, 3.75f)
                close()
                moveTo(3f, 18f)
                curveTo(3f, 17.448f, 3.448f, 17f, 4f, 17f)
                curveTo(4.552f, 17f, 5f, 17.448f, 5f, 18f)
                curveTo(5f, 18.552f, 5.448f, 19f, 6f, 19f)
                horizontalLineTo(18f)
                curveTo(18.552f, 19f, 19f, 18.552f, 19f, 18f)
                curveTo(19f, 17.448f, 19.448f, 17f, 20f, 17f)
                curveTo(20.552f, 17f, 21f, 17.448f, 21f, 18f)
                curveTo(21f, 19.657f, 19.657f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
                close()
            }
        }.build()

        return _BorderBottomThick!!
    }

@Suppress("ObjectPropertyName")
private var _BorderBottomThick: ImageVector? = null

@Preview
@Composable
private fun BorderBottomThickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BorderBottomThick, contentDescription = null)
    }
}
