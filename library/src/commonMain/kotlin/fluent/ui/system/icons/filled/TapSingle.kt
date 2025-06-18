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

public val FluentUi.Filled.TapSingle: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TapSingle",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.748f, 6f)
            curveTo(13.107f, 6f, 13.701f, 6.898f, 13.748f, 8.326f)
            lineTo(13.751f, 8.515f)
            verticalLineTo(11.001f)
            lineTo(16.623f, 11.423f)
            curveTo(16.735f, 11.44f, 16.846f, 11.463f, 16.955f, 11.493f)
            curveTo(18.363f, 11.882f, 19.211f, 13.297f, 18.915f, 14.707f)
            lineTo(18.874f, 14.876f)
            lineTo(17.647f, 19.319f)
            curveTo(17.475f, 19.941f, 16.976f, 20.414f, 16.354f, 20.558f)
            lineTo(16.208f, 20.585f)
            lineTo(13.148f, 21.024f)
            curveTo(12.387f, 21.133f, 11.651f, 20.734f, 11.323f, 20.052f)
            lineTo(11.262f, 19.912f)
            lineTo(11.046f, 19.34f)
            curveTo(10.8f, 18.691f, 10.395f, 18.116f, 9.869f, 17.666f)
            lineTo(9.667f, 17.503f)
            lineTo(8.07f, 16.302f)
            curveTo(7.986f, 16.239f, 7.897f, 16.184f, 7.804f, 16.137f)
            lineTo(7.661f, 16.073f)
            lineTo(5.466f, 15.205f)
            curveTo(5.193f, 15.097f, 5.008f, 14.839f, 4.993f, 14.545f)
            curveTo(4.957f, 13.823f, 5.482f, 13.299f, 6.414f, 12.833f)
            curveTo(7.133f, 12.473f, 8.142f, 12.503f, 9.48f, 12.876f)
            lineTo(9.752f, 12.956f)
            verticalLineTo(8.506f)
            curveTo(9.752f, 6.968f, 10.331f, 6f, 11.748f, 6f)
            close()
            moveTo(11.748f, 2.5f)
            curveTo(14.924f, 2.5f, 17.499f, 5.075f, 17.499f, 8.25f)
            curveTo(17.499f, 9.044f, 17.338f, 9.799f, 17.048f, 10.487f)
            lineTo(17.221f, 10.529f)
            curveTo(17.073f, 10.488f, 16.921f, 10.456f, 16.768f, 10.434f)
            lineTo(15.501f, 10.248f)
            curveTo(15.819f, 9.653f, 15.999f, 8.973f, 15.999f, 8.25f)
            curveTo(15.999f, 5.903f, 14.096f, 4f, 11.748f, 4f)
            curveTo(9.401f, 4f, 7.498f, 5.903f, 7.498f, 8.25f)
            curveTo(7.498f, 9.429f, 7.978f, 10.496f, 8.753f, 11.266f)
            lineTo(8.752f, 11.681f)
            curveTo(8.139f, 11.572f, 7.584f, 11.545f, 7.081f, 11.609f)
            curveTo(6.399f, 10.664f, 5.998f, 9.504f, 5.998f, 8.25f)
            curveTo(5.998f, 5.075f, 8.573f, 2.5f, 11.748f, 2.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TapSinglePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TapSingle, contentDescription = null)
    }
}
