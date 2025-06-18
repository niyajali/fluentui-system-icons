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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Showerhead: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Showerhead",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.49f, 4.982f)
            lineTo(19.479f, 6.993f)
            curveTo(19.158f, 6.514f, 18.786f, 6.059f, 18.363f, 5.636f)
            curveTo(17.941f, 5.214f, 17.487f, 4.842f, 17.01f, 4.522f)
            lineTo(19.02f, 2.512f)
            curveTo(19.702f, 1.829f, 20.808f, 1.829f, 21.49f, 2.512f)
            curveTo(22.172f, 3.194f, 22.172f, 4.3f, 21.49f, 4.982f)
            close()
            moveTo(5.28f, 13.72f)
            curveTo(5.573f, 14.013f, 5.573f, 14.487f, 5.28f, 14.78f)
            lineTo(3.28f, 16.78f)
            curveTo(2.987f, 17.073f, 2.513f, 17.073f, 2.22f, 16.78f)
            curveTo(1.927f, 16.487f, 1.927f, 16.013f, 2.22f, 15.72f)
            lineTo(4.22f, 13.72f)
            curveTo(4.513f, 13.427f, 4.987f, 13.427f, 5.28f, 13.72f)
            close()
            moveTo(7.78f, 17.28f)
            curveTo(8.073f, 16.987f, 8.073f, 16.513f, 7.78f, 16.22f)
            curveTo(7.487f, 15.927f, 7.013f, 15.927f, 6.72f, 16.22f)
            lineTo(4.72f, 18.22f)
            curveTo(4.427f, 18.513f, 4.427f, 18.987f, 4.72f, 19.28f)
            curveTo(5.013f, 19.573f, 5.487f, 19.573f, 5.78f, 19.28f)
            lineTo(7.78f, 17.28f)
            close()
            moveTo(10.28f, 19.78f)
            curveTo(10.573f, 19.487f, 10.573f, 19.013f, 10.28f, 18.72f)
            curveTo(9.987f, 18.427f, 9.513f, 18.427f, 9.22f, 18.72f)
            lineTo(7.22f, 20.72f)
            curveTo(6.927f, 21.013f, 6.927f, 21.487f, 7.22f, 21.78f)
            curveTo(7.513f, 22.073f, 7.987f, 22.073f, 8.28f, 21.78f)
            lineTo(10.28f, 19.78f)
            close()
            moveTo(3.736f, 7.263f)
            curveTo(4.419f, 6.58f, 5.526f, 6.58f, 6.209f, 7.263f)
            lineTo(16.768f, 17.822f)
            curveTo(17.451f, 18.505f, 17.451f, 19.612f, 16.768f, 20.295f)
            curveTo(16.085f, 20.978f, 14.978f, 20.978f, 14.295f, 20.295f)
            lineTo(3.736f, 9.736f)
            curveTo(3.053f, 9.053f, 3.053f, 7.946f, 3.736f, 7.263f)
            close()
            moveTo(6.916f, 6.556f)
            curveTo(6.782f, 6.422f, 6.638f, 6.304f, 6.486f, 6.204f)
            curveTo(9.62f, 3.22f, 14.58f, 3.266f, 17.657f, 6.343f)
            curveTo(20.732f, 9.418f, 20.78f, 14.374f, 17.802f, 17.508f)
            curveTo(17.707f, 17.369f, 17.598f, 17.238f, 17.475f, 17.115f)
            lineTo(6.916f, 6.556f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShowerheadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Showerhead, contentDescription = null)
    }
}
