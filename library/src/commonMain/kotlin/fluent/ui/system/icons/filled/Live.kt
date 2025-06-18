/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Live: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Live",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.343f, 4.938f)
            curveTo(6.733f, 5.329f, 6.733f, 5.962f, 6.343f, 6.353f)
            curveTo(3.218f, 9.478f, 3.218f, 14.545f, 6.343f, 17.67f)
            curveTo(6.733f, 18.06f, 6.733f, 18.694f, 6.343f, 19.084f)
            curveTo(5.952f, 19.475f, 5.319f, 19.475f, 4.929f, 19.084f)
            curveTo(1.022f, 15.178f, 1.022f, 8.845f, 4.929f, 4.938f)
            curveTo(5.319f, 4.548f, 5.952f, 4.548f, 6.343f, 4.938f)
            close()
            moveTo(19.074f, 4.938f)
            curveTo(22.981f, 8.845f, 22.981f, 15.178f, 19.074f, 19.084f)
            curveTo(18.684f, 19.475f, 18.051f, 19.475f, 17.66f, 19.084f)
            curveTo(17.27f, 18.694f, 17.27f, 18.06f, 17.66f, 17.67f)
            curveTo(20.785f, 14.545f, 20.785f, 9.478f, 17.66f, 6.353f)
            curveTo(17.27f, 5.962f, 17.27f, 5.329f, 17.66f, 4.938f)
            curveTo(18.051f, 4.548f, 18.684f, 4.548f, 19.074f, 4.938f)
            close()
            moveTo(9.31f, 7.812f)
            curveTo(9.7f, 8.202f, 9.7f, 8.835f, 9.31f, 9.226f)
            curveTo(7.779f, 10.757f, 7.779f, 13.239f, 9.31f, 14.77f)
            curveTo(9.7f, 15.161f, 9.7f, 15.794f, 9.31f, 16.184f)
            curveTo(8.919f, 16.575f, 8.286f, 16.575f, 7.895f, 16.184f)
            curveTo(5.583f, 13.872f, 5.583f, 10.124f, 7.895f, 7.812f)
            curveTo(8.286f, 7.421f, 8.919f, 7.421f, 9.31f, 7.812f)
            close()
            moveTo(16.268f, 7.812f)
            curveTo(18.58f, 10.124f, 18.58f, 13.872f, 16.268f, 16.184f)
            curveTo(15.877f, 16.575f, 15.244f, 16.575f, 14.854f, 16.184f)
            curveTo(14.463f, 15.794f, 14.463f, 15.161f, 14.854f, 14.77f)
            curveTo(16.385f, 13.239f, 16.385f, 10.757f, 14.854f, 9.226f)
            curveTo(14.463f, 8.835f, 14.463f, 8.202f, 14.854f, 7.812f)
            curveTo(15.244f, 7.421f, 15.877f, 7.421f, 16.268f, 7.812f)
            close()
            moveTo(12.082f, 10.581f)
            curveTo(12.91f, 10.581f, 13.582f, 11.253f, 13.582f, 12.081f)
            curveTo(13.582f, 12.91f, 12.91f, 13.581f, 12.082f, 13.581f)
            curveTo(11.253f, 13.581f, 10.582f, 12.91f, 10.582f, 12.081f)
            curveTo(10.582f, 11.253f, 11.253f, 10.581f, 12.082f, 10.581f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Live, contentDescription = null)
    }
}
