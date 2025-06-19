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

public val FluentIcons.Regular.ImageArrowForward: ImageVector
    get() {
        if (_ImageArrowForward != null) {
            return _ImageArrowForward!!
        }
        _ImageArrowForward = ImageVector.Builder(
            name = "Regular.ImageArrowForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(12f, 9.538f, 9.538f, 12f, 6.5f, 12f)
                curveTo(3.462f, 12f, 1f, 9.538f, 1f, 6.5f)
                curveTo(1f, 3.462f, 3.462f, 1f, 6.5f, 1f)
                curveTo(9.538f, 1f, 12f, 3.462f, 12f, 6.5f)
                close()
                moveTo(5.354f, 4.354f)
                curveTo(5.549f, 4.158f, 5.549f, 3.842f, 5.354f, 3.646f)
                curveTo(5.158f, 3.451f, 4.842f, 3.451f, 4.646f, 3.646f)
                lineTo(3.146f, 5.146f)
                curveTo(2.951f, 5.342f, 2.951f, 5.658f, 3.146f, 5.854f)
                lineTo(4.646f, 7.354f)
                curveTo(4.842f, 7.549f, 5.158f, 7.549f, 5.354f, 7.354f)
                curveTo(5.549f, 7.158f, 5.549f, 6.842f, 5.354f, 6.646f)
                lineTo(4.707f, 6f)
                horizontalLineTo(6.75f)
                curveTo(7.993f, 6f, 9f, 7.007f, 9f, 8.25f)
                verticalLineTo(8.5f)
                curveTo(9f, 8.776f, 9.224f, 9f, 9.5f, 9f)
                curveTo(9.776f, 9f, 10f, 8.776f, 10f, 8.5f)
                verticalLineTo(8.25f)
                curveTo(10f, 6.455f, 8.545f, 5f, 6.75f, 5f)
                horizontalLineTo(4.707f)
                lineTo(5.354f, 4.354f)
                close()
                moveTo(3f, 11.978f)
                curveTo(3.463f, 12.275f, 3.967f, 12.514f, 4.5f, 12.686f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 17.958f, 4.536f, 18.158f, 4.603f, 18.344f)
                lineTo(10.426f, 12.643f)
                curveTo(11.259f, 11.827f, 12.568f, 11.788f, 13.446f, 12.527f)
                lineTo(13.574f, 12.643f)
                lineTo(19.396f, 18.345f)
                curveTo(19.463f, 18.159f, 19.5f, 17.959f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(12.686f)
                curveTo(12.514f, 3.967f, 12.275f, 3.463f, 11.978f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(11.978f)
                close()
                moveTo(18.33f, 19.401f)
                lineTo(12.525f, 13.715f)
                curveTo(12.26f, 13.455f, 11.85f, 13.432f, 11.559f, 13.644f)
                lineTo(11.475f, 13.715f)
                lineTo(5.668f, 19.401f)
                curveTo(5.85f, 19.465f, 6.046f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(17.954f, 19.5f, 18.149f, 19.465f, 18.33f, 19.401f)
                close()
                moveTo(15.252f, 6.5f)
                curveTo(16.496f, 6.5f, 17.504f, 7.508f, 17.504f, 8.752f)
                curveTo(17.504f, 9.996f, 16.496f, 11.004f, 15.252f, 11.004f)
                curveTo(14.008f, 11.004f, 13f, 9.996f, 13f, 8.752f)
                curveTo(13f, 7.508f, 14.008f, 6.5f, 15.252f, 6.5f)
                close()
                moveTo(15.252f, 8f)
                curveTo(14.837f, 8f, 14.5f, 8.337f, 14.5f, 8.752f)
                curveTo(14.5f, 9.167f, 14.837f, 9.504f, 15.252f, 9.504f)
                curveTo(15.667f, 9.504f, 16.004f, 9.167f, 16.004f, 8.752f)
                curveTo(16.004f, 8.337f, 15.667f, 8f, 15.252f, 8f)
                close()
            }
        }.build()

        return _ImageArrowForward!!
    }

@Suppress("ObjectPropertyName")
private var _ImageArrowForward: ImageVector? = null

@Preview
@Composable
private fun ImageArrowForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageArrowForward, contentDescription = null)
    }
}
