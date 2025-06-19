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

public val FluentIcons.Regular.BorderInside: ImageVector
    get() {
        if (_BorderInside != null) {
            return _BorderInside!!
        }
        _BorderInside = ImageVector.Builder(
            name = "Regular.BorderInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.25f, 4.5f)
                curveTo(13.664f, 4.5f, 14f, 4.164f, 14f, 3.75f)
                curveTo(14f, 3.336f, 13.664f, 3f, 13.25f, 3f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 3f, 10f, 3.336f, 10f, 3.75f)
                curveTo(10f, 4.164f, 10.336f, 4.5f, 10.75f, 4.5f)
                lineTo(13.25f, 4.5f)
                close()
                moveTo(3.75f, 10f)
                curveTo(4.164f, 10f, 4.5f, 10.336f, 4.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(4.5f, 13.664f, 4.164f, 14f, 3.75f, 14f)
                curveTo(3.336f, 14f, 3f, 13.664f, 3f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(3f, 10.336f, 3.336f, 10f, 3.75f, 10f)
                close()
                moveTo(20.25f, 10f)
                curveTo(19.836f, 10f, 19.5f, 10.336f, 19.5f, 10.75f)
                verticalLineTo(13.25f)
                curveTo(19.5f, 13.664f, 19.836f, 14f, 20.25f, 14f)
                curveTo(20.664f, 14f, 21f, 13.664f, 21f, 13.25f)
                verticalLineTo(10.75f)
                curveTo(21f, 10.336f, 20.664f, 10f, 20.25f, 10f)
                close()
                moveTo(14f, 20.25f)
                curveTo(14f, 20.664f, 13.664f, 21f, 13.25f, 21f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 21f, 10f, 20.664f, 10f, 20.25f)
                curveTo(10f, 19.836f, 10.336f, 19.5f, 10.75f, 19.5f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 19.5f, 14f, 19.836f, 14f, 20.25f)
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
                moveTo(6.25f, 21f)
                curveTo(6.664f, 21f, 7f, 20.664f, 7f, 20.25f)
                curveTo(7f, 19.836f, 6.664f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 19.5f, 4.5f, 18.94f, 4.5f, 18.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 17.336f, 4.164f, 17f, 3.75f, 17f)
                curveTo(3.336f, 17f, 3f, 17.336f, 3f, 17.75f)
                verticalLineTo(18.25f)
                curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
                horizontalLineTo(6.25f)
                close()
                moveTo(17f, 20.25f)
                curveTo(17f, 20.664f, 17.336f, 21f, 17.75f, 21f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 17.336f, 20.664f, 17f, 20.25f, 17f)
                curveTo(19.836f, 17f, 19.5f, 17.336f, 19.5f, 17.75f)
                verticalLineTo(18.25f)
                curveTo(19.5f, 18.94f, 18.94f, 19.5f, 18.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(17.336f, 19.5f, 17f, 19.836f, 17f, 20.25f)
                close()
                moveTo(12.75f, 6.25f)
                curveTo(12.75f, 5.836f, 12.414f, 5.5f, 12f, 5.5f)
                curveTo(11.586f, 5.5f, 11.25f, 5.836f, 11.25f, 6.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 11.25f, 5.5f, 11.586f, 5.5f, 12f)
                curveTo(5.5f, 12.414f, 5.836f, 12.75f, 6.25f, 12.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.75f)
                curveTo(11.25f, 18.164f, 11.586f, 18.5f, 12f, 18.5f)
                curveTo(12.414f, 18.5f, 12.75f, 18.164f, 12.75f, 17.75f)
                verticalLineTo(12.75f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 12.75f, 18.5f, 12.414f, 18.5f, 12f)
                curveTo(18.5f, 11.586f, 18.164f, 11.25f, 17.75f, 11.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.25f)
                close()
            }
        }.build()

        return _BorderInside!!
    }

@Suppress("ObjectPropertyName")
private var _BorderInside: ImageVector? = null

@Preview
@Composable
private fun BorderInsidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BorderInside, contentDescription = null)
    }
}
