/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Filled.ShiftsQuestionMark: ImageVector
    get() {
        if (_ShiftsQuestionMark != null) {
            return _ShiftsQuestionMark!!
        }
        _ShiftsQuestionMark = ImageVector.Builder(
            name = "Filled.ShiftsQuestionMark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.5f, 12f)
                curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
                curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
                curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
                close()
                moveTo(6.5f, 19.88f)
                curveTo(6.155f, 19.88f, 5.875f, 20.16f, 5.875f, 20.504f)
                curveTo(5.875f, 20.849f, 6.155f, 21.129f, 6.5f, 21.129f)
                curveTo(6.845f, 21.129f, 7.125f, 20.849f, 7.125f, 20.504f)
                curveTo(7.125f, 20.16f, 6.845f, 19.88f, 6.5f, 19.88f)
                close()
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                lineTo(11.977f, 21.001f)
                curveTo(12.625f, 19.991f, 13f, 18.789f, 13f, 17.5f)
                curveTo(13f, 15.985f, 12.481f, 14.59f, 11.611f, 13.487f)
                lineTo(11.679f, 13.497f)
                lineTo(11.75f, 13.5f)
                horizontalLineTo(16.248f)
                lineTo(16.35f, 13.493f)
                curveTo(16.716f, 13.443f, 16.998f, 13.13f, 16.998f, 12.75f)
                curveTo(16.998f, 12.37f, 16.716f, 12.057f, 16.35f, 12.007f)
                lineTo(16.248f, 12f)
                horizontalLineTo(12.5f)
                verticalLineTo(6.75f)
                lineTo(12.493f, 6.648f)
                curveTo(12.443f, 6.282f, 12.13f, 6f, 11.75f, 6f)
                curveTo(11.37f, 6f, 11.057f, 6.282f, 11.007f, 6.648f)
                lineTo(11f, 6.75f)
                verticalLineTo(12.75f)
                lineTo(11.005f, 12.814f)
                curveTo(9.836f, 11.691f, 8.249f, 11f, 6.5f, 11f)
                curveTo(5.211f, 11f, 4.009f, 11.375f, 2.999f, 12.023f)
                lineTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(6.5f, 14.003f)
                curveTo(5.452f, 14.003f, 4.636f, 14.821f, 4.647f, 15.957f)
                curveTo(4.649f, 16.233f, 4.875f, 16.455f, 5.151f, 16.453f)
                curveTo(5.428f, 16.45f, 5.649f, 16.224f, 5.647f, 15.948f)
                curveTo(5.641f, 15.369f, 6.006f, 15.003f, 6.5f, 15.003f)
                curveTo(6.972f, 15.003f, 7.353f, 15.395f, 7.353f, 15.953f)
                curveTo(7.353f, 16.177f, 7.278f, 16.344f, 7.036f, 16.63f)
                lineTo(6.937f, 16.743f)
                lineTo(6.671f, 17.033f)
                curveTo(6.187f, 17.575f, 6f, 17.926f, 6f, 18.501f)
                curveTo(6f, 18.777f, 6.224f, 19.001f, 6.5f, 19.001f)
                curveTo(6.776f, 19.001f, 7f, 18.777f, 7f, 18.501f)
                curveTo(7f, 18.268f, 7.076f, 18.098f, 7.324f, 17.806f)
                lineTo(7.425f, 17.691f)
                lineTo(7.69f, 17.4f)
                curveTo(8.168f, 16.866f, 8.353f, 16.519f, 8.353f, 15.953f)
                curveTo(8.353f, 14.849f, 7.531f, 14.003f, 6.5f, 14.003f)
                close()
            }
        }.build()

        return _ShiftsQuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _ShiftsQuestionMark: ImageVector? = null

@Preview
@Composable
private fun ShiftsQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShiftsQuestionMark, contentDescription = null)
    }
}
