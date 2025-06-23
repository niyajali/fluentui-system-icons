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

public val FluentIcons.Regular.DialpadQuestionMark: ImageVector
    get() {
        if (_DialpadQuestionMark != null) {
            return _DialpadQuestionMark!!
        }
        _DialpadQuestionMark = ImageVector.Builder(
            name = "Regular.DialpadQuestionMark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2.75f)
                curveTo(12.69f, 2.75f, 13.25f, 3.31f, 13.25f, 4f)
                curveTo(13.25f, 4.69f, 12.69f, 5.25f, 12f, 5.25f)
                curveTo(11.309f, 5.25f, 10.75f, 4.69f, 10.75f, 4f)
                curveTo(10.75f, 3.31f, 11.309f, 2.75f, 12f, 2.75f)
                close()
                moveTo(13.25f, 9f)
                curveTo(13.25f, 8.31f, 12.69f, 7.75f, 12f, 7.75f)
                curveTo(11.309f, 7.75f, 10.75f, 8.31f, 10.75f, 9f)
                curveTo(10.75f, 9.69f, 11.309f, 10.25f, 12f, 10.25f)
                curveTo(12.69f, 10.25f, 13.25f, 9.69f, 13.25f, 9f)
                close()
                moveTo(7.004f, 12.75f)
                curveTo(7.694f, 12.75f, 8.254f, 13.31f, 8.254f, 14f)
                curveTo(8.254f, 14.69f, 7.694f, 15.25f, 7.004f, 15.25f)
                curveTo(6.314f, 15.25f, 5.754f, 14.69f, 5.754f, 14f)
                curveTo(5.754f, 13.31f, 6.314f, 12.75f, 7.004f, 12.75f)
                close()
                moveTo(12f, 12.75f)
                curveTo(12.297f, 12.75f, 12.57f, 12.854f, 12.784f, 13.027f)
                curveTo(12.214f, 13.628f, 11.757f, 14.338f, 11.448f, 15.122f)
                curveTo(11.035f, 14.918f, 10.75f, 14.493f, 10.75f, 14f)
                curveTo(10.75f, 13.31f, 11.309f, 12.75f, 12f, 12.75f)
                close()
                moveTo(16.996f, 7.75f)
                curveTo(17.686f, 7.75f, 18.246f, 8.31f, 18.246f, 9f)
                curveTo(18.246f, 9.69f, 17.686f, 10.25f, 16.996f, 10.25f)
                curveTo(16.306f, 10.25f, 15.746f, 9.69f, 15.746f, 9f)
                curveTo(15.746f, 8.31f, 16.306f, 7.75f, 16.996f, 7.75f)
                close()
                moveTo(8.254f, 9f)
                curveTo(8.254f, 8.31f, 7.694f, 7.75f, 7.004f, 7.75f)
                curveTo(6.314f, 7.75f, 5.754f, 8.31f, 5.754f, 9f)
                curveTo(5.754f, 9.69f, 6.314f, 10.25f, 7.004f, 10.25f)
                curveTo(7.694f, 10.25f, 8.254f, 9.69f, 8.254f, 9f)
                close()
                moveTo(18.246f, 4f)
                curveTo(18.246f, 3.31f, 17.686f, 2.75f, 16.996f, 2.75f)
                curveTo(16.306f, 2.75f, 15.746f, 3.31f, 15.746f, 4f)
                curveTo(15.746f, 4.69f, 16.306f, 5.25f, 16.996f, 5.25f)
                curveTo(17.686f, 5.25f, 18.246f, 4.69f, 18.246f, 4f)
                close()
                moveTo(7.004f, 2.75f)
                curveTo(7.694f, 2.75f, 8.254f, 3.31f, 8.254f, 4f)
                curveTo(8.254f, 4.69f, 7.694f, 5.25f, 7.004f, 5.25f)
                curveTo(6.314f, 5.25f, 5.754f, 4.69f, 5.754f, 4f)
                curveTo(5.754f, 3.31f, 6.314f, 2.75f, 7.004f, 2.75f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.537f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.537f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(17.5f, 19.751f)
                curveTo(17.155f, 19.751f, 16.875f, 20.031f, 16.875f, 20.375f)
                curveTo(16.875f, 20.72f, 17.155f, 21f, 17.5f, 21f)
                curveTo(17.845f, 21f, 18.124f, 20.72f, 18.124f, 20.375f)
                curveTo(18.124f, 20.031f, 17.845f, 19.751f, 17.5f, 19.751f)
                close()
                moveTo(17.5f, 13.874f)
                curveTo(16.452f, 13.874f, 15.636f, 14.691f, 15.646f, 15.828f)
                curveTo(15.649f, 16.104f, 15.875f, 16.326f, 16.151f, 16.323f)
                curveTo(16.427f, 16.321f, 16.649f, 16.095f, 16.646f, 15.819f)
                curveTo(16.641f, 15.24f, 17.006f, 14.874f, 17.5f, 14.874f)
                curveTo(17.972f, 14.874f, 18.353f, 15.266f, 18.353f, 15.824f)
                curveTo(18.353f, 16.016f, 18.298f, 16.166f, 18.129f, 16.385f)
                lineTo(18.035f, 16.501f)
                lineTo(17.936f, 16.614f)
                lineTo(17.671f, 16.904f)
                lineTo(17.535f, 17.062f)
                curveTo(17.151f, 17.518f, 17f, 17.854f, 17f, 18.372f)
                curveTo(17f, 18.648f, 17.224f, 18.872f, 17.5f, 18.872f)
                curveTo(17.776f, 18.872f, 18f, 18.648f, 18f, 18.372f)
                curveTo(18f, 18.168f, 18.058f, 18.013f, 18.239f, 17.781f)
                lineTo(18.324f, 17.677f)
                lineTo(18.425f, 17.562f)
                lineTo(18.69f, 17.271f)
                lineTo(18.825f, 17.116f)
                curveTo(19.203f, 16.665f, 19.353f, 16.333f, 19.353f, 15.824f)
                curveTo(19.353f, 14.72f, 18.531f, 13.874f, 17.5f, 13.874f)
                close()
            }
        }.build()

        return _DialpadQuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _DialpadQuestionMark: ImageVector? = null

@Preview
@Composable
private fun DialpadQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DialpadQuestionMark, contentDescription = null)
    }
}
