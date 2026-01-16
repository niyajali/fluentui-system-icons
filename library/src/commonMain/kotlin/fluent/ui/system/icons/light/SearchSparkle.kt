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

package fluent.ui.system.icons.light

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * SearchSparkle Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used in AI powered search scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_search_sparkle_32_light.svg)
 * 
 * @return The [ImageVector] for the SearchSparkle icon.
 */
public val FluentIcons.Light.SearchSparkle: ImageVector
    get() {
        if (_searchSparkle != null) {
            return _searchSparkle!!
        }
        _searchSparkle = Builder(name = "SearchSparkle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.368f, 6.368f)
                curveTo(8.984f, 3.752f, 12.547f, 2.662f, 15.953f, 3.094f)
                lineTo(15.0f, 3.42f)
                curveTo(14.646f, 3.535f, 14.33f, 3.739f, 14.079f, 4.01f)
                curveTo(11.534f, 4.111f, 9.018f, 5.132f, 7.075f, 7.075f)
                curveTo(2.975f, 11.176f, 2.975f, 17.824f, 7.075f, 21.925f)
                curveTo(11.176f, 26.025f, 17.824f, 26.025f, 21.925f, 21.925f)
                curveTo(23.358f, 20.491f, 24.288f, 18.746f, 24.719f, 16.907f)
                curveTo(24.793f, 16.984f, 24.874f, 17.056f, 24.96f, 17.12f)
                curveTo(25.161f, 17.26f, 25.387f, 17.359f, 25.624f, 17.412f)
                curveTo(25.165f, 19.173f, 24.283f, 20.846f, 22.976f, 22.27f)
                lineTo(29.852f, 29.146f)
                curveTo(30.047f, 29.342f, 30.047f, 29.658f, 29.852f, 29.854f)
                curveTo(29.656f, 30.048f, 29.34f, 30.049f, 29.145f, 29.854f)
                lineTo(22.269f, 22.977f)
                curveTo(17.757f, 27.118f, 10.741f, 27.004f, 6.368f, 22.632f)
                curveTo(1.877f, 18.141f, 1.877f, 10.859f, 6.368f, 6.368f)
                close()
                moveTo(25.982f, 10.0f)
                curveTo(26.057f, 10.0f, 26.13f, 10.023f, 26.191f, 10.066f)
                curveTo(26.253f, 10.11f, 26.299f, 10.172f, 26.324f, 10.242f)
                lineTo(26.622f, 11.16f)
                curveTo(26.715f, 11.439f, 26.872f, 11.693f, 27.08f, 11.9f)
                curveTo(27.288f, 12.108f, 27.542f, 12.265f, 27.821f, 12.357f)
                lineTo(28.739f, 12.656f)
                lineTo(28.758f, 12.66f)
                curveTo(28.829f, 12.685f, 28.89f, 12.732f, 28.934f, 12.793f)
                curveTo(28.977f, 12.854f, 29.0f, 12.927f, 29.0f, 13.002f)
                curveTo(29.0f, 13.077f, 28.977f, 13.151f, 28.934f, 13.212f)
                curveTo(28.89f, 13.273f, 28.829f, 13.319f, 28.758f, 13.344f)
                lineTo(27.84f, 13.643f)
                curveTo(27.561f, 13.735f, 27.307f, 13.892f, 27.099f, 14.1f)
                curveTo(26.891f, 14.307f, 26.733f, 14.561f, 26.641f, 14.84f)
                lineTo(26.342f, 15.758f)
                curveTo(26.317f, 15.828f, 26.271f, 15.89f, 26.21f, 15.934f)
                curveTo(26.149f, 15.977f, 26.075f, 16.0f, 26.0f, 16.0f)
                curveTo(25.925f, 16.0f, 25.851f, 15.977f, 25.79f, 15.934f)
                curveTo(25.729f, 15.89f, 25.683f, 15.828f, 25.658f, 15.758f)
                lineTo(25.359f, 14.84f)
                curveTo(25.267f, 14.56f, 25.11f, 14.305f, 24.902f, 14.097f)
                curveTo(24.694f, 13.888f, 24.441f, 13.731f, 24.161f, 13.638f)
                lineTo(23.242f, 13.34f)
                curveTo(23.171f, 13.315f, 23.11f, 13.268f, 23.066f, 13.207f)
                curveTo(23.023f, 13.146f, 23.0f, 13.073f, 23.0f, 12.998f)
                curveTo(23.0f, 12.923f, 23.023f, 12.849f, 23.066f, 12.788f)
                curveTo(23.11f, 12.727f, 23.171f, 12.681f, 23.242f, 12.656f)
                lineTo(24.161f, 12.357f)
                curveTo(24.437f, 12.262f, 24.687f, 12.104f, 24.892f, 11.896f)
                curveTo(25.096f, 11.689f, 25.25f, 11.437f, 25.341f, 11.16f)
                lineTo(25.64f, 10.242f)
                curveTo(25.665f, 10.172f, 25.711f, 10.11f, 25.772f, 10.066f)
                curveTo(25.834f, 10.023f, 25.907f, 10.0f, 25.982f, 10.0f)
                close()
                moveTo(20.467f, 0.0f)
                curveTo(20.604f, 0.0f, 20.738f, 0.043f, 20.851f, 0.122f)
                curveTo(20.963f, 0.201f, 21.048f, 0.314f, 21.094f, 0.443f)
                lineTo(21.641f, 2.126f)
                curveTo(21.811f, 2.637f, 22.098f, 3.102f, 22.479f, 3.483f)
                curveTo(22.861f, 3.865f, 23.327f, 4.152f, 23.839f, 4.322f)
                lineTo(25.522f, 4.869f)
                lineTo(25.557f, 4.877f)
                curveTo(25.686f, 4.923f, 25.799f, 5.008f, 25.878f, 5.12f)
                curveTo(25.957f, 5.232f, 26.0f, 5.366f, 26.0f, 5.504f)
                curveTo(26.0f, 5.641f, 25.957f, 5.775f, 25.878f, 5.888f)
                curveTo(25.799f, 6.0f, 25.686f, 6.085f, 25.557f, 6.131f)
                lineTo(23.872f, 6.678f)
                curveTo(23.36f, 6.848f, 22.895f, 7.135f, 22.514f, 7.517f)
                curveTo(22.132f, 7.898f, 21.845f, 8.363f, 21.675f, 8.874f)
                lineTo(21.127f, 10.557f)
                curveTo(21.122f, 10.571f, 21.117f, 10.584f, 21.111f, 10.598f)
                curveTo(21.063f, 10.71f, 20.984f, 10.807f, 20.884f, 10.878f)
                curveTo(20.772f, 10.957f, 20.638f, 11.0f, 20.5f, 11.0f)
                curveTo(20.362f, 11.0f, 20.229f, 10.957f, 20.116f, 10.878f)
                curveTo(20.004f, 10.799f, 19.919f, 10.686f, 19.873f, 10.557f)
                lineTo(19.325f, 8.874f)
                curveTo(19.202f, 8.499f, 19.015f, 8.148f, 18.774f, 7.837f)
                curveTo(18.686f, 7.723f, 18.591f, 7.614f, 18.488f, 7.512f)
                curveTo(18.107f, 7.129f, 17.641f, 6.841f, 17.128f, 6.67f)
                lineTo(15.444f, 6.123f)
                curveTo(15.315f, 6.077f, 15.202f, 5.992f, 15.122f, 5.88f)
                curveTo(15.043f, 5.768f, 15.0f, 5.634f, 15.0f, 5.496f)
                curveTo(15.0f, 5.359f, 15.043f, 5.224f, 15.122f, 5.112f)
                curveTo(15.202f, 5.0f, 15.315f, 4.915f, 15.444f, 4.869f)
                lineTo(17.128f, 4.322f)
                curveTo(17.634f, 4.148f, 18.092f, 3.858f, 18.468f, 3.478f)
                curveTo(18.833f, 3.107f, 19.11f, 2.659f, 19.278f, 2.168f)
                lineTo(19.839f, 0.443f)
                curveTo(19.885f, 0.314f, 19.97f, 0.201f, 20.082f, 0.122f)
                curveTo(20.194f, 0.043f, 20.329f, 0.0f, 20.467f, 0.0f)
                close()
            }
        }
        .build()
        return _searchSparkle!!
    }

@Suppress("ObjectPropertyName")
private var _searchSparkle: ImageVector? = null

@Preview
@Composable
private fun SearchSparklePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.SearchSparkle, contentDescription = "SearchSparkle Icon")
    }
}

