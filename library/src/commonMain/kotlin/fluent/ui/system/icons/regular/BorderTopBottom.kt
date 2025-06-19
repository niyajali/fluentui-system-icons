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

public val FluentIcons.Regular.BorderTopBottom: ImageVector
    get() {
        if (_BorderTopBottom != null) {
            return _BorderTopBottom!!
        }
        _BorderTopBottom = ImageVector.Builder(
            name = "Regular.BorderTopBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 7f)
                curveTo(3.336f, 7f, 3f, 6.664f, 3f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(18.25f)
                curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 6.664f, 20.664f, 7f, 20.25f, 7f)
                curveTo(19.836f, 7f, 19.5f, 6.664f, 19.5f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 6.664f, 4.164f, 7f, 3.75f, 7f)
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
                moveTo(3f, 17.75f)
                curveTo(3f, 17.336f, 3.336f, 17f, 3.75f, 17f)
                curveTo(4.164f, 17f, 4.5f, 17.336f, 4.5f, 17.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(18.94f, 19.5f, 19.5f, 18.94f, 19.5f, 18.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 17.336f, 19.836f, 17f, 20.25f, 17f)
                curveTo(20.664f, 17f, 21f, 17.336f, 21f, 17.75f)
                verticalLineTo(18.25f)
                curveTo(21f, 19.769f, 19.769f, 21f, 18.25f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(17.75f)
                close()
            }
        }.build()

        return _BorderTopBottom!!
    }

@Suppress("ObjectPropertyName")
private var _BorderTopBottom: ImageVector? = null

@Preview
@Composable
private fun BorderTopBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BorderTopBottom, contentDescription = null)
    }
}
