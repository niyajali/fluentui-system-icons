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

public val FluentIcons.Regular.ArrowBetweenDown: ImageVector
    get() {
        if (_ArrowBetweenDown != null) {
            return _ArrowBetweenDown!!
        }
        _ArrowBetweenDown = ImageVector.Builder(
            name = "Regular.ArrowBetweenDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 1.75f)
                curveTo(6f, 1.336f, 5.664f, 1f, 5.25f, 1f)
                curveTo(4.836f, 1f, 4.5f, 1.336f, 4.5f, 1.75f)
                verticalLineTo(2.25f)
                curveTo(4.5f, 3.493f, 5.507f, 4.5f, 6.75f, 4.5f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 4.5f, 19f, 3.493f, 19f, 2.25f)
                verticalLineTo(1.75f)
                curveTo(19f, 1.336f, 18.664f, 1f, 18.25f, 1f)
                curveTo(17.836f, 1f, 17.5f, 1.336f, 17.5f, 1.75f)
                verticalLineTo(2.25f)
                curveTo(17.5f, 2.664f, 17.164f, 3f, 16.75f, 3f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 3f, 6f, 2.664f, 6f, 2.25f)
                verticalLineTo(1.75f)
                close()
                moveTo(11.75f, 6f)
                curveTo(12.164f, 6f, 12.5f, 6.336f, 12.5f, 6.75f)
                verticalLineTo(15.439f)
                lineTo(16.22f, 11.72f)
                curveTo(16.513f, 11.427f, 16.987f, 11.427f, 17.28f, 11.72f)
                curveTo(17.573f, 12.013f, 17.573f, 12.487f, 17.28f, 12.78f)
                lineTo(12.28f, 17.78f)
                curveTo(11.987f, 18.073f, 11.513f, 18.073f, 11.22f, 17.78f)
                lineTo(6.22f, 12.78f)
                curveTo(5.927f, 12.487f, 5.927f, 12.013f, 6.22f, 11.72f)
                curveTo(6.513f, 11.427f, 6.987f, 11.427f, 7.28f, 11.72f)
                lineTo(11f, 15.439f)
                verticalLineTo(6.75f)
                curveTo(11f, 6.336f, 11.336f, 6f, 11.75f, 6f)
                close()
                moveTo(4.5f, 21.75f)
                curveTo(4.5f, 20.507f, 5.507f, 19.5f, 6.75f, 19.5f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 19.5f, 19f, 20.507f, 19f, 21.75f)
                verticalLineTo(22.25f)
                curveTo(19f, 22.664f, 18.664f, 23f, 18.25f, 23f)
                curveTo(17.836f, 23f, 17.5f, 22.664f, 17.5f, 22.25f)
                verticalLineTo(21.75f)
                curveTo(17.5f, 21.336f, 17.164f, 21f, 16.75f, 21f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 21f, 6f, 21.336f, 6f, 21.75f)
                verticalLineTo(22.25f)
                curveTo(6f, 22.664f, 5.664f, 23f, 5.25f, 23f)
                curveTo(4.836f, 23f, 4.5f, 22.664f, 4.5f, 22.25f)
                verticalLineTo(21.75f)
                close()
            }
        }.build()

        return _ArrowBetweenDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBetweenDown: ImageVector? = null

@Preview
@Composable
private fun ArrowBetweenDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowBetweenDown, contentDescription = null)
    }
}
