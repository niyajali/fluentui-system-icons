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

public val FluentIcons.Regular.SquareDovetailJoint: ImageVector
    get() {
        if (_SquareDovetailJoint != null) {
            return _SquareDovetailJoint!!
        }
        _SquareDovetailJoint = ImageVector.Builder(
            name = "Regular.SquareDovetailJoint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                close()
                moveTo(4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(9f)
                verticalLineTo(9.75f)
                curveTo(9f, 9.991f, 9.116f, 10.217f, 9.312f, 10.358f)
                curveTo(9.506f, 10.5f, 9.76f, 10.537f, 9.988f, 10.461f)
                lineTo(13.501f, 9.29f)
                verticalLineTo(14.709f)
                lineTo(9.988f, 13.538f)
                curveTo(9.761f, 13.462f, 9.508f, 13.499f, 9.312f, 13.641f)
                curveTo(9.117f, 13.782f, 9f, 14.008f, 9f, 14.249f)
                verticalLineTo(19.499f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.499f, 4.5f, 18.716f, 4.5f, 17.75f)
                close()
                moveTo(19.5f, 17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15.291f)
                lineTo(14.013f, 16.462f)
                curveTo(14.24f, 16.538f, 14.493f, 16.501f, 14.689f, 16.359f)
                curveTo(14.884f, 16.218f, 15.001f, 15.992f, 15.001f, 15.751f)
                verticalLineTo(8.251f)
                curveTo(15.001f, 8.01f, 14.885f, 7.784f, 14.689f, 7.643f)
                curveTo(14.494f, 7.501f, 14.239f, 7.463f, 14.013f, 7.54f)
                lineTo(10.5f, 8.711f)
                verticalLineTo(4.502f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.502f, 19.5f, 5.286f, 19.5f, 6.252f)
                verticalLineTo(17.752f)
                verticalLineTo(17.75f)
                close()
            }
        }.build()

        return _SquareDovetailJoint!!
    }

@Suppress("ObjectPropertyName")
private var _SquareDovetailJoint: ImageVector? = null

@Preview
@Composable
private fun SquareDovetailJointPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SquareDovetailJoint, contentDescription = null)
    }
}
