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

public val FluentIcons.Regular.ChatMultiple: ImageVector
    get() {
        if (_ChatMultiple != null) {
            return _ChatMultiple!!
        }
        _ChatMultiple = ImageVector.Builder(
            name = "Regular.ChatMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.562f, 3f)
                curveTo(5.419f, 3f, 2.062f, 6.358f, 2.062f, 10.5f)
                curveTo(2.062f, 11.633f, 2.313f, 12.709f, 2.764f, 13.673f)
                curveTo(2.51f, 14.671f, 2.226f, 15.784f, 2.04f, 16.515f)
                curveTo(1.807f, 17.428f, 2.629f, 18.259f, 3.544f, 18.039f)
                curveTo(4.294f, 17.859f, 5.447f, 17.582f, 6.474f, 17.337f)
                curveTo(7.417f, 17.763f, 8.462f, 18f, 9.562f, 18f)
                curveTo(13.704f, 18f, 17.062f, 14.642f, 17.062f, 10.5f)
                curveTo(17.062f, 6.358f, 13.704f, 3f, 9.562f, 3f)
                close()
                moveTo(3.562f, 10.5f)
                curveTo(3.562f, 7.186f, 6.248f, 4.5f, 9.562f, 4.5f)
                curveTo(12.875f, 4.5f, 15.562f, 7.186f, 15.562f, 10.5f)
                curveTo(15.562f, 13.814f, 12.875f, 16.5f, 9.562f, 16.5f)
                curveTo(8.601f, 16.5f, 7.695f, 16.275f, 6.892f, 15.875f)
                lineTo(6.648f, 15.754f)
                lineTo(6.384f, 15.817f)
                curveTo(5.461f, 16.036f, 4.395f, 16.292f, 3.596f, 16.484f)
                curveTo(3.795f, 15.705f, 4.058f, 14.672f, 4.286f, 13.776f)
                lineTo(4.356f, 13.5f)
                lineTo(4.226f, 13.247f)
                curveTo(3.801f, 12.425f, 3.562f, 11.491f, 3.562f, 10.5f)
                close()
                moveTo(14.562f, 21f)
                curveTo(12.592f, 21f, 10.8f, 20.241f, 9.462f, 19f)
                curveTo(9.495f, 19f, 9.528f, 19f, 9.562f, 19f)
                curveTo(10.28f, 19f, 10.977f, 18.911f, 11.643f, 18.743f)
                curveTo(12.507f, 19.225f, 13.502f, 19.5f, 14.562f, 19.5f)
                curveTo(15.522f, 19.5f, 16.428f, 19.275f, 17.232f, 18.875f)
                lineTo(17.475f, 18.754f)
                lineTo(17.74f, 18.817f)
                curveTo(18.661f, 19.036f, 19.705f, 19.263f, 20.479f, 19.426f)
                curveTo(20.304f, 18.676f, 20.065f, 17.671f, 19.837f, 16.776f)
                lineTo(19.767f, 16.5f)
                lineTo(19.897f, 16.247f)
                curveTo(20.322f, 15.425f, 20.562f, 14.491f, 20.562f, 13.5f)
                curveTo(20.562f, 11.385f, 19.468f, 9.526f, 17.815f, 8.458f)
                curveTo(17.636f, 7.734f, 17.365f, 7.048f, 17.015f, 6.411f)
                curveTo(19.952f, 7.427f, 22.062f, 10.217f, 22.062f, 13.5f)
                curveTo(22.062f, 14.633f, 21.81f, 15.709f, 21.359f, 16.674f)
                curveTo(21.612f, 17.682f, 21.868f, 18.774f, 22.03f, 19.477f)
                curveTo(22.235f, 20.362f, 21.455f, 21.163f, 20.563f, 20.977f)
                curveTo(19.836f, 20.825f, 18.693f, 20.581f, 17.649f, 20.337f)
                curveTo(16.707f, 20.763f, 15.661f, 21f, 14.562f, 21f)
                close()
            }
        }.build()

        return _ChatMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _ChatMultiple: ImageVector? = null

@Preview
@Composable
private fun ChatMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ChatMultiple, contentDescription = null)
    }
}
