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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.BluetoothSearching: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BluetoothSearching",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.463f, 2.057f)
            curveTo(11.743f, 1.941f, 12.066f, 2.005f, 12.28f, 2.22f)
            lineTo(17.28f, 7.22f)
            curveTo(17.428f, 7.368f, 17.508f, 7.571f, 17.499f, 7.78f)
            curveTo(17.491f, 7.99f, 17.395f, 8.186f, 17.236f, 8.321f)
            lineTo(12.908f, 12f)
            lineTo(17.236f, 15.679f)
            curveTo(17.395f, 15.814f, 17.491f, 16.01f, 17.499f, 16.22f)
            curveTo(17.508f, 16.429f, 17.428f, 16.632f, 17.28f, 16.78f)
            lineTo(12.28f, 21.78f)
            curveTo(12.066f, 21.995f, 11.743f, 22.059f, 11.463f, 21.943f)
            curveTo(11.183f, 21.827f, 11f, 21.553f, 11f, 21.25f)
            verticalLineTo(13.622f)
            lineTo(7.236f, 16.822f)
            curveTo(6.92f, 17.09f, 6.447f, 17.051f, 6.179f, 16.736f)
            curveTo(5.91f, 16.42f, 5.949f, 15.947f, 6.264f, 15.679f)
            lineTo(10.592f, 12f)
            lineTo(6.264f, 8.321f)
            curveTo(5.949f, 8.053f, 5.91f, 7.58f, 6.179f, 7.264f)
            curveTo(6.447f, 6.949f, 6.92f, 6.91f, 7.236f, 7.179f)
            lineTo(11f, 10.378f)
            verticalLineTo(2.75f)
            curveTo(11f, 2.447f, 11.183f, 2.173f, 11.463f, 2.057f)
            close()
            moveTo(12.5f, 13.622f)
            verticalLineTo(19.439f)
            lineTo(15.645f, 16.295f)
            lineTo(12.5f, 13.622f)
            close()
            moveTo(12.5f, 10.378f)
            lineTo(15.645f, 7.705f)
            lineTo(12.5f, 4.561f)
            verticalLineTo(10.378f)
            close()
            moveTo(17.967f, 9.587f)
            curveTo(18.333f, 9.393f, 18.787f, 9.533f, 18.981f, 9.9f)
            curveTo(19.313f, 10.527f, 19.5f, 11.243f, 19.5f, 12f)
            curveTo(19.5f, 12.757f, 19.313f, 13.472f, 18.981f, 14.1f)
            curveTo(18.787f, 14.467f, 18.333f, 14.606f, 17.967f, 14.413f)
            curveTo(17.601f, 14.219f, 17.461f, 13.766f, 17.654f, 13.399f)
            curveTo(17.875f, 12.982f, 18f, 12.507f, 18f, 12f)
            curveTo(18f, 11.493f, 17.875f, 11.018f, 17.654f, 10.601f)
            curveTo(17.461f, 10.234f, 17.601f, 9.781f, 17.967f, 9.587f)
            close()
            moveTo(20.6f, 7.799f)
            curveTo(20.351f, 7.468f, 19.881f, 7.401f, 19.549f, 7.65f)
            curveTo(19.218f, 7.899f, 19.152f, 8.369f, 19.4f, 8.7f)
            curveTo(20.091f, 9.619f, 20.5f, 10.761f, 20.5f, 12f)
            curveTo(20.5f, 13.239f, 20.091f, 14.381f, 19.4f, 15.3f)
            curveTo(19.152f, 15.631f, 19.218f, 16.101f, 19.549f, 16.35f)
            curveTo(19.881f, 16.599f, 20.351f, 16.532f, 20.6f, 16.201f)
            curveTo(21.479f, 15.031f, 22f, 13.575f, 22f, 12f)
            curveTo(22f, 10.425f, 21.479f, 8.969f, 20.6f, 7.799f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BluetoothSearchingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BluetoothSearching, contentDescription = null)
    }
}
