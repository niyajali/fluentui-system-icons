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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.WindowDevTools: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowDevTools",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(11.044f)
            curveTo(11.136f, 20.518f, 11.368f, 20.058f, 11.74f, 19.686f)
            lineTo(11.926f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(11.032f)
            curveTo(19.672f, 11.052f, 19.843f, 11.08f, 20.012f, 11.117f)
            curveTo(20.482f, 11.219f, 20.826f, 11.529f, 21f, 11.908f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(15.994f, 11.933f)
            lineTo(14.28f, 10.22f)
            curveTo(13.987f, 9.927f, 13.513f, 9.927f, 13.22f, 10.22f)
            curveTo(12.927f, 10.513f, 12.927f, 10.987f, 13.22f, 11.28f)
            lineTo(14.911f, 12.972f)
            curveTo(15.042f, 12.803f, 15.185f, 12.641f, 15.34f, 12.486f)
            curveTo(15.545f, 12.28f, 15.764f, 12.096f, 15.994f, 11.933f)
            close()
            moveTo(10.78f, 11.28f)
            curveTo(11.073f, 10.987f, 11.073f, 10.513f, 10.78f, 10.22f)
            curveTo(10.487f, 9.927f, 10.013f, 9.927f, 9.72f, 10.22f)
            lineTo(6.72f, 13.22f)
            curveTo(6.427f, 13.513f, 6.427f, 13.987f, 6.72f, 14.28f)
            lineTo(9.72f, 17.28f)
            curveTo(10.013f, 17.573f, 10.487f, 17.573f, 10.78f, 17.28f)
            curveTo(11.073f, 16.987f, 11.073f, 16.513f, 10.78f, 16.22f)
            lineTo(8.311f, 13.75f)
            lineTo(10.78f, 11.28f)
            close()
            moveTo(19.799f, 12.094f)
            curveTo(20.152f, 12.171f, 20.239f, 12.601f, 19.984f, 12.856f)
            lineTo(18.08f, 14.76f)
            curveTo(17.483f, 15.357f, 17.483f, 16.324f, 18.08f, 16.92f)
            curveTo(18.676f, 17.517f, 19.643f, 17.517f, 20.239f, 16.92f)
            lineTo(22.144f, 15.016f)
            curveTo(22.399f, 14.761f, 22.829f, 14.848f, 22.906f, 15.201f)
            curveTo(23.192f, 16.511f, 22.826f, 17.934f, 21.807f, 18.952f)
            curveTo(20.598f, 20.161f, 18.819f, 20.451f, 17.337f, 19.823f)
            lineTo(14.607f, 22.553f)
            curveTo(14.011f, 23.149f, 13.044f, 23.149f, 12.447f, 22.553f)
            curveTo(11.851f, 21.956f, 11.851f, 20.989f, 12.447f, 20.393f)
            lineTo(15.176f, 17.663f)
            curveTo(14.548f, 16.181f, 14.838f, 14.401f, 16.047f, 13.193f)
            curveTo(17.065f, 12.175f, 18.489f, 11.808f, 19.799f, 12.094f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WindowDevToolsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WindowDevTools, contentDescription = null)
    }
}
