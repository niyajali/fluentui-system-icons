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

public val FluentIcons.Filled.MailFishHook: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailFishHook",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 3.5f)
            curveTo(15.698f, 3.5f, 15.25f, 3.948f, 15.25f, 4.5f)
            curveTo(15.25f, 5.052f, 15.698f, 5.5f, 16.25f, 5.5f)
            curveTo(16.802f, 5.5f, 17.25f, 5.052f, 17.25f, 4.5f)
            curveTo(17.25f, 3.948f, 16.802f, 3.5f, 16.25f, 3.5f)
            close()
            moveTo(18.75f, 4.5f)
            curveTo(18.75f, 5.619f, 18.014f, 6.567f, 17f, 6.886f)
            verticalLineTo(9.25f)
            curveTo(17f, 10.493f, 18.007f, 11.5f, 19.25f, 11.5f)
            curveTo(20.493f, 11.5f, 21.5f, 10.493f, 21.5f, 9.25f)
            verticalLineTo(9f)
            horizontalLineTo(20.25f)
            curveTo(19.947f, 9f, 19.673f, 8.817f, 19.557f, 8.537f)
            curveTo(19.441f, 8.257f, 19.505f, 7.934f, 19.72f, 7.72f)
            lineTo(21.72f, 5.72f)
            curveTo(21.934f, 5.505f, 22.257f, 5.441f, 22.537f, 5.557f)
            curveTo(22.817f, 5.673f, 23f, 5.947f, 23f, 6.25f)
            verticalLineTo(9.25f)
            curveTo(23f, 11.321f, 21.321f, 13f, 19.25f, 13f)
            curveTo(17.179f, 13f, 15.5f, 11.321f, 15.5f, 9.25f)
            verticalLineTo(6.886f)
            curveTo(14.486f, 6.567f, 13.75f, 5.619f, 13.75f, 4.5f)
            curveTo(13.75f, 3.119f, 14.869f, 2f, 16.25f, 2f)
            curveTo(17.631f, 2f, 18.75f, 3.119f, 18.75f, 4.5f)
            close()
            moveTo(12.785f, 4f)
            horizontalLineTo(5.25f)
            lineTo(5.064f, 4.005f)
            curveTo(3.464f, 4.095f, 2.174f, 5.343f, 2.016f, 6.924f)
            lineTo(12f, 12.153f)
            lineTo(14.733f, 10.722f)
            curveTo(14.582f, 10.259f, 14.5f, 9.764f, 14.5f, 9.25f)
            verticalLineTo(7.532f)
            curveTo(13.454f, 6.927f, 12.75f, 5.795f, 12.75f, 4.5f)
            curveTo(12.75f, 4.33f, 12.762f, 4.163f, 12.785f, 4f)
            close()
            moveTo(15.417f, 12.057f)
            lineTo(12.348f, 13.664f)
            curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
            lineTo(2f, 8.608f)
            verticalLineTo(16.75f)
            lineTo(2.005f, 16.934f)
            curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
            horizontalLineTo(18.75f)
            lineTo(18.934f, 19.995f)
            curveTo(20.643f, 19.899f, 22f, 18.483f, 22f, 16.75f)
            verticalLineTo(13.123f)
            curveTo(21.224f, 13.675f, 20.275f, 14f, 19.25f, 14f)
            curveTo(17.677f, 14f, 16.282f, 13.235f, 15.417f, 12.057f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailFishHookPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailFishHook, contentDescription = null)
    }
}
