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

public val FluentIcons.Filled.PersonQuestionMark: ImageVector
    get() {
        if (_PersonQuestionMark != null) {
            return _PersonQuestionMark!!
        }
        _PersonQuestionMark = ImageVector.Builder(
            name = "Filled.PersonQuestionMark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.023f, 14f)
                curveTo(11.375f, 15.01f, 11f, 16.211f, 11f, 17.5f)
                curveTo(11f, 19.131f, 11.601f, 20.621f, 12.592f, 21.762f)
                curveTo(11.797f, 21.922f, 10.932f, 22.001f, 10f, 22.001f)
                curveTo(6.579f, 22.001f, 4.056f, 20.929f, 2.514f, 18.765f)
                curveTo(2.182f, 18.299f, 2.004f, 17.741f, 2.004f, 17.169f)
                verticalLineTo(16.249f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.253f, 14f)
                lineTo(12.023f, 14f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                close()
                moveTo(17.5f, 19.751f)
                curveTo(17.156f, 19.751f, 16.876f, 20.031f, 16.876f, 20.376f)
                curveTo(16.876f, 20.721f, 17.156f, 21f, 17.5f, 21f)
                curveTo(17.845f, 21f, 18.125f, 20.721f, 18.125f, 20.376f)
                curveTo(18.125f, 20.031f, 17.845f, 19.751f, 17.5f, 19.751f)
                close()
                moveTo(17.5f, 13.874f)
                curveTo(16.452f, 13.874f, 15.636f, 14.692f, 15.647f, 15.829f)
                curveTo(15.65f, 16.105f, 15.876f, 16.326f, 16.152f, 16.324f)
                curveTo(16.428f, 16.321f, 16.65f, 16.095f, 16.647f, 15.819f)
                curveTo(16.641f, 15.24f, 17.007f, 14.874f, 17.5f, 14.874f)
                curveTo(17.973f, 14.874f, 18.354f, 15.266f, 18.354f, 15.824f)
                curveTo(18.354f, 16.016f, 18.299f, 16.166f, 18.13f, 16.385f)
                lineTo(18.036f, 16.501f)
                lineTo(17.937f, 16.615f)
                lineTo(17.671f, 16.905f)
                lineTo(17.535f, 17.062f)
                curveTo(17.152f, 17.518f, 17f, 17.854f, 17f, 18.372f)
                curveTo(17f, 18.648f, 17.224f, 18.872f, 17.5f, 18.872f)
                curveTo(17.777f, 18.872f, 18f, 18.648f, 18f, 18.372f)
                curveTo(18f, 18.169f, 18.059f, 18.013f, 18.239f, 17.782f)
                lineTo(18.324f, 17.677f)
                lineTo(18.425f, 17.562f)
                lineTo(18.691f, 17.271f)
                lineTo(18.826f, 17.116f)
                curveTo(19.204f, 16.666f, 19.354f, 16.333f, 19.354f, 15.824f)
                curveTo(19.354f, 14.72f, 18.531f, 13.874f, 17.5f, 13.874f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
        }.build()

        return _PersonQuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _PersonQuestionMark: ImageVector? = null

@Preview
@Composable
private fun PersonQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonQuestionMark, contentDescription = null)
    }
}
