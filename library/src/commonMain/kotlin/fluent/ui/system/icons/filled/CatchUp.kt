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

public val FluentIcons.Filled.CatchUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CatchUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.372f, 7.269f)
            curveTo(10.706f, 5.568f, 8.296f, 5.577f, 7.642f, 7.282f)
            lineTo(6.435f, 10.431f)
            curveTo(6.361f, 10.624f, 6.176f, 10.752f, 5.969f, 10.752f)
            horizontalLineTo(4.562f)
            curveTo(4.196f, 10.294f, 3.632f, 10.001f, 3f, 10.001f)
            curveTo(1.895f, 10.001f, 1f, 10.896f, 1f, 12.001f)
            curveTo(1f, 13.105f, 1.895f, 14.001f, 3f, 14.001f)
            curveTo(3.839f, 14.001f, 4.557f, 13.484f, 4.854f, 12.752f)
            horizontalLineTo(5.969f)
            curveTo(7.004f, 12.752f, 7.932f, 12.113f, 8.303f, 11.146f)
            lineTo(9.51f, 7.998f)
            lineTo(12.731f, 16.225f)
            curveTo(13.368f, 17.853f, 15.64f, 17.937f, 16.396f, 16.361f)
            lineTo(17.993f, 13.035f)
            curveTo(18.076f, 12.862f, 18.251f, 12.752f, 18.444f, 12.752f)
            horizontalLineTo(19.146f)
            curveTo(19.443f, 13.484f, 20.161f, 14.001f, 21f, 14.001f)
            curveTo(22.105f, 14.001f, 23f, 13.105f, 23f, 12.001f)
            curveTo(23f, 10.896f, 22.105f, 10.001f, 21f, 10.001f)
            curveTo(20.368f, 10.001f, 19.805f, 10.294f, 19.438f, 10.752f)
            horizontalLineTo(18.444f)
            curveTo(17.482f, 10.752f, 16.606f, 11.303f, 16.19f, 12.17f)
            lineTo(14.593f, 15.496f)
            lineTo(11.372f, 7.269f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CatchUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CatchUp, contentDescription = null)
    }
}
